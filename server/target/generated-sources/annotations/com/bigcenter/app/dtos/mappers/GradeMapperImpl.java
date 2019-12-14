package com.bigcenter.app.dtos.mappers;

import com.bigcenter.app.dtos.requests.grade.GradeDto;
import com.bigcenter.app.entities.Grade;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-06T14:34:06+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23.0.2 (Amazon.com Inc.)"
)
@Component
public class GradeMapperImpl implements GradeMapper {

    @Override
    public GradeDto toDto(Grade grade) {
        if ( grade == null ) {
            return null;
        }

        GradeDto gradeDto = new GradeDto();

        gradeDto.setScore( grade.getScore() );
        gradeDto.setMidtermScore( grade.getMidtermScore() );
        gradeDto.setFinalScore( grade.getFinalScore() );

        return gradeDto;
    }

    @Override
    public Grade toEntity(GradeDto dto) {
        if ( dto == null ) {
            return null;
        }

        Grade grade = new Grade();

        grade.setScore( dto.getScore() );
        grade.setMidtermScore( dto.getMidtermScore() );
        grade.setFinalScore( dto.getFinalScore() );

        return grade;
    }
}
