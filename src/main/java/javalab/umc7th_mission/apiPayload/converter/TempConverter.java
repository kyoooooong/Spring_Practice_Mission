package umc.spring.apiPayload.converter;

import umc.spring.dto.TempResponse;

public class TempConverter {
    public static TempResponse.TempTestDTO toTempDTO(){
        return TempResponse.TempTestDTO.builder()
                .testString("This is Test!")
                .build();
    }
    public static TempResponse.TempExceptionDTO toTempExceptionDTO(Integer flag){
        return TempResponse.TempExceptionDTO.builder()
                .flag(flag)
                .build();
    }
}
