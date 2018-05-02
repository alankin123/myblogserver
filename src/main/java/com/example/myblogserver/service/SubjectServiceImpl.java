package com.example.myblogserver.service;

import com.example.myblogserver.mapper.SubjectMapper;
import com.example.myblogserver.model.Subject;
import com.example.myblogserver.model.SubjectExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectMapper subjectMapper;//这里会报错，但是并不会影响

    @Override
    public Object addSubject(Subject subject) {
        return subjectMapper.insert(subject);
    }

    @Override
    public Object delSubject(int id) {
        return null;
    }

    @Override
    public Object updateSubject(Subject subject) {
        return subjectMapper.updateByExample(subject, new SubjectExample());
    }

    @Override
    public Object findSubject(int id) {
        return subjectMapper.selectByExample(new SubjectExample());
    }

    @Override
    public Object subscribSubject(int id) {
        return null;
    }
}