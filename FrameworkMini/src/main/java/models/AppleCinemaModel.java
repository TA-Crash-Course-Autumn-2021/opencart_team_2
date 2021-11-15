package models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AppleCinemaModel {

    private int radio;// 5 or 6 or 7
    private int checkbox;// 8 or 9 or 10 or 11
    private String text;
    private int select; // 1 or 2 or 3 or 4
    private String textarea;
    private String file;
    private String date;
    private String time;
    private String dateAndTime;
    private String qty;
}
