package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {

    private String username;
    private int age;

    @QueryProjection    /* Gradle - compileQuerydsl 실행 시 QMemberDto 생성됨 */
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
