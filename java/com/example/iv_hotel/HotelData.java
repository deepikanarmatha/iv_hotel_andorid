package com.example.iv_hotel;

// HotelData.java
import java.util.ArrayList;
import java.util.List;

public class HotelData {

    private static List<Hotel> hotelList = new ArrayList<>();


    static {
        hotelList.add(new Hotel(
                "Heden Golf",
                3.9,
                "Abidjan, Côte d'Ivoire",
                "Set in landscaped gardens overlooking the Ébrié lagoon, this upscale hotel featuring contemporary local art and architectural touches.",
                "lib/assets/images/img_one.jpg",
                "$127",
                "+225 22 48 26 26",
                200,
                "25% OFF",
                "Free Wi-Fi, Fitness Center, Free Breakfast, Kid Friendly",
                "12 PM",
                "11 AM",
                "Bagels with turkey, gourmet croissant, scrambled eggs, crispy mozza burger"
        ));

        hotelList.add(new Hotel(
                "Onomo",
                4.3,
                "Abidjan, Côte d'Ivoire",
                "Adagio City Aparthotel is a joint venture ....",
                "lib/assets/images/img_two.jpg",
                "$120",
                "+225 22 48 26 26",
                200,
                "null",
                "Free Wi-Fi, Fitness Center, Free Breakfast, Kid Friendly",
                "12 PM",
                "11 AM",
                "Bagels with turkey, gourmet croissant, scrambled eggs, crispy mozza burger"
        ));

        hotelList.add(new Hotel(
                "Adagio",
                4.5,
                "Abidjan, Côte d'Ivoire",
                "Adagio City Aparthotel is a joint venture ...",
                "lib/assets/images/img_three.png",
                "$100",
                "+225 22 48 26 26",
                200,
                "15% OFF",
                "Free Wi-Fi, Fitness Center, Free Breakfast, Kid Friendly",
                "12 PM",
                "11 AM",
                "Bagels with turkey, gourmet croissant, scrambled eggs, crispy mozza burger"
        ));
    }



    public static List<Hotel> getHotelList() {
        return hotelList;
    }
}
