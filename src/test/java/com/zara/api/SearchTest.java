package com.zara.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SearchTest {

    @Test
    public void test() {
        String URL = "https://www.zara.com/itxrest/1/search/store/20201/query";

        given()
                .header("accept-language","ru")
                .header("Accept-Charset","*/*")
                .header("priority","u=1, i")
                .header("referer","https://www.zara.com/by/ru/search?searchTerm=%D0%A2%D0%A0%D0%98%D0%9A%D0%9E%D0%A2%D0%90%D0%96%D0%9D%D0%AB%D0%99%20%D0%91%D0%9E%D0%9C%D0%91%D0%95%D0%A0%20%D0%A1%20%D0%A0%D0%9E%D0%9C%D0%91%D0%90%D0%9C%D0%98&section=WOMAN")
                .header("user-agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36")
                .header("Cookie","ITXSESSIONID=0bb62fccc9b401dfd0d4094eedca2e8c; bm_sz=330D1380BCBC3A08BC04C579769EC0BD~YAAQFgxAF0DLI2eZAQAAQmYTfR0dpkSS3yrg2SjdFotVN7/RZxfOS3iJ8FcGAOtlCPlCL0VH9MOTTCPjhXn8dZE05AjUaPFaNMTeY8AVsnHoXT6N+WVCglPU/+N9q/4ANdshXRDHaNyI0KxXM66+2ffsEZYEj5iw2gdbPh7YTYY9v5jf4nDFZ6SudhrIXtwk6vze12b3KyN1ChVjn67U66IYGwqwbY0306L7zOf/Oq6TbMb+2shZn+Nzwel7500i8IzckgF8KDFXwJv0+2cMIDDB5OtTyFxvtvnzVRKvbYW2byfLr5JZkdEZm2R3Ds3UmiWcQzpfrz1CvJh15dC6R7zViTrrLwyXBlDl9uDxvaNTR9ePcV1f1jtP5pRRv9joSGVVGlfxwndVS8JJ~3687733~3421751; IDROSTA=5b270b07bcee:1880c9856db91d712450b7070; rid=d852f890-4a6f-4009-b7bc-5e06bee42792; cart-was-updated-in-standard=true; ak_bmsc=F11B1189F10B981DB6AE1DDAE6CE0FE1~000000000000000000000000000000~YAAQHwxAF6IGpVKZAQAAcGwTfR09p25NXzg8L9a2d7LESKL+ZcSv4OB5WgZXyUlyzf1+9fVEInkzWYN1gmJFf0X1imro/EX9ikWTJ54zUoRKHgNNgl4Ccncja8qbma48pQHiRI8CPyjB4dELZxL8sJYjCU7RjPO6KQPorREOWkQ+aibDgc0onB/LHq09fIqgljYEvFElRlFIVvykIcWJiJy1UfMgivCa3CWEaKKK2BDBJuezwG59xlEn9zFH4i96UzQdYeHOSmrrEVXVVEBvZ5CeO8wcFpZ6T7tViPp9d9cxeQPF5vK4dmxmfKiZECmet0HejoPrPK1WqnDdVrwXGxJiRR8kQQnnRHi5Dy/UlWcj4sMav2KI+G9bWiTO/oyMNMfQNU84ZrT8mveUSvbPwK1iZQWpj/b//6KKiz6IEvspFV5r75KodkICqN0md26wyaQzviD+X3hIV/e0uw==; lastRskxRun=1758740049220; rskxRunCookie=0; rCookie=i3vkkhlkbxwcjghctsvjkmfycez45; _abck=F8D9EB68288DA94ED17A3249A747F883~0~YAAQHwxAF0kHpVKZAQAAQm8TfQ6Yj7xjKe5ovdzMFTl5ytQm3Vkm4FgLrzbjvgeY8yC78+IWhM7Rp2n2TE8imhmi9fUdbgN7EGIHraZzW7JTX55gT77V6D87Xjkb2cxqYIfxgAcqgQVKN5nd3Hr5h6O2qS67ZTqAedT3YirVyGciLKXxVig9cSKHNbHTdxCd/3V63oeezEbf/ZqoT4WSoWlHy6DgOf5SleAg+9Se4ko2sk3meUlUAJVBCbERsvUYf2wcxgbNqTuXxLQi2Nf9U3MKU1ffdEXolZ3e42ifvDOpG/LGw35keGxMYLmJvpJeeO+P9cri2/Oixw+oQP2CeLzsP12T4FVWBYbPEfuDwi0e8fM+J7c8EjHUQzyzSRk08c/lx26y6trfbcNENJXMBQBOdRAroKtNXg1WLR+4P5dDXxvVrZunKOH1HhI56/asYH98VdoMDgzkGdJI5WiQ14pBzrKUTTCGFgbsZpYVT4WSMQLL2Xo2KwJPDMsecRPGsptYOA6ypom7W+XnmYEZSg1ay8yjwDEeGNnQl6oqBkRHSVTsFb10Uh3DBU+d6t1OdZX6RqzkqoQhgbNoeNpu79SdQISHy9PMZNSnandTGoEksRU2unI7nGCV0upItS4=~-1~-1~1758743648~AAQAAAAE%2f%2f%2f%2f%2f4KHsuc+EQcdMLMkHl+fJVPZYv48MQf3OgWhswseKpnpNSfLTA5Ea+eXQAUnwoXuFp6eVxehpFbyPkaxPfs0zbom6cyHMB9aDWWE~-1; OptanonAlertBoxClosed=2025-09-24T18:54:18.302Z; _gcl_au=1.1.2031946564.1758740058; OptanonConsent=isGpcEnabled=0&datestamp=Wed+Sep+24+2025+21%3A54%3A18+GMT%2B0300+(%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B0%2C+%D1%81%D1%82%D0%B0%D0%BD%D0%B4%D0%B0%D1%80%D1%82%D0%BD%D0%BE%D0%B5+%D0%B2%D1%80%D0%B5%D0%BC%D1%8F)&version=202508.2.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=096e3003-b829-4eb7-bb23-5c02c6296f02&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0001%3A1%2CC0002%3A1%2CC0003%3A1%2CC0004%3A1&intType=1; CookiesConsent=C0001%3BC0002%3BC0003%3BC0004; _ga_HCEXQGE0MW=GS2.1.s1758740058$o1$g0$t1758740058$j60$l0$h0; _ga=GA1.1.1627981502.1758740058; TS0122c9b6=01e7ba8b97cdf65956921613d4315587711bf1284d27d48f44abf3af492c8e7666f064037039a3a8555e74aeb3fa3a0b41e3b08184; ITXDEVICEID=8be8b55826795c924ed987e68e398c4b; UAITXID=f17ca9ccd30fb2d437822824e36513399dc424fe4096fae85f0c55921296b0b4; bm_sv=97E7D0461277FFC29E550C509BA31C65~YAAQFAxAFwW8p1KZAQAAyygUfR1lkofDSshWAC+nDWMyCyWC7C5fdG1ShVwtWvyj/p7LB3ndsJfli4NEk310JvLuXmjblHJb0Dysm9wwHLjMCUEhke5gpKF9a7dUqedG5PRcLd6kTLDGyvphF77sGtxn2FOncf7+YSSGxEC099xshsF1QcuSCub5j2GB68riyfpWQZOUZky3cooBpCHQUgT5zIxWshjtVM7c82OSqrYPc7+zMHVp8qylbaglGQ==~1")
                .queryParam("query","ТРИКОТАЖНЫЙ БОМБЕР С РОМБАМИ")
                .queryParam("locale","ru_RU")
                .queryParam("session","")
                .queryParam("","51d8fd72-70a0-4a33-aa45-87ac5763742b")
                .queryParam("deviceType","desktop")
                .queryParam("deviceOS","Mac%20OS")
                .queryParam("deviceOSVersion","10.15.7")
                .queryParam("catalogue","25551")
                .queryParam("warehouse","18563")
                .queryParam("section","WOMAN")
                .queryParam("offset","0")
                .queryParam("limit","36")
                .queryParam("scope","default")
                .queryParam("origin","search")
                .queryParam("filter","searchSection%3AWOMAN")
                .queryParam("visitorId","8be8b55826795c924ed987e68e398c4b")
                .queryParam("sessionId","0bb62fccc9b401dfd0d4094eedca2e8c")
                .queryParam("ajax","true")
                .when().get(URL)
                .then().log().all().statusCode(200).body("results[0].content.name",equalTo("ТРИКОТАЖНЫЙ БОМБЕР С РОМБАМИ"));
    }
}
