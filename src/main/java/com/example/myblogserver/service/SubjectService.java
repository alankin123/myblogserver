package com.example.myblogserver.service;

import com.example.myblogserver.model.Subject;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SubjectService {

    Object addSubject(Subject subject);

    Object delSubject(int id);

    Object updateSubject(Subject subject);

    Object findSubject(int id);

    Object subscribSubject(int id);
}
