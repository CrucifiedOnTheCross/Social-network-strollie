package ru.riveo.strollie.messenger.repository;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.riveo.strollie.messenger.entity.MessageEntity;

import java.util.List;
import java.util.UUID;

public interface MessageRepository extends JpaRepository<MessageEntity, Integer> {

    List<MessageEntity> findByChatId(@NotNull UUID chatId);

    Page<MessageEntity> findByChatIdAndDeletedAtIsNull(UUID chatId, Pageable pageable);

}
