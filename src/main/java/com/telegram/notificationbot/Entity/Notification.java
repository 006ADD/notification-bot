package com.telegram.notificationbot.Entity;

import com.telegram.notificationbot.Entity.contract.AbstractEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "notifications")
@Setter
@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Notification extends AbstractEntity {

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Enumerated(EnumType.STRING)
    Status status;

    @Column(name = "seconds")
    Long seconds;



    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
