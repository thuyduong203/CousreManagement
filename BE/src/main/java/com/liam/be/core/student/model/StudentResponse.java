package com.liam.be.core.student.model;

import com.liam.be.infrastructure.constant.GenderUser;
import com.liam.be.infrastructure.util.DateUtil;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;

public interface StudentResponse {
    Long getId();

    String getCode();

    String getName();

    @Value("#{target.birth_date}")
    LocalDateTime getDateBirth();

    default String getBirthDate() {
        if (getDateBirth()!=null){
            return DateUtil.dateToString(getDateBirth());
        }
        return null;
    }

    String getEmail();

    String getPhone();

    String getAddress();

    String getStatus();

    GenderUser getGender();
}
