package by.threeceni;

import java.util.Random;

public class Products {

    public static String getRandomNameJellyCandy() {
        String[] allJellyCandy = {"МЯГКИЕ ФРУКТОВЫЕ КОНФЕТЫ с фруктовым соком Фруктовый сад", "Конфета жев. Жуй Жуйсы (микс)",
                "Жевательная конфета \"Фрутти\" с ароматом клубники", "Жевательная конфета YUPO METRE LIQ со вкусом Арбуз",
                "Мягкие фруктовые конфеты с фруктовым соком «ЮПО ЧЕРВИ»", "Желейные конфеты \"JELLY CANDY\" (egg)",
                "Конфеты с желейными корпусами глазированные  «Желейные» со вкусом вишни", "Конфеты желейные радуга JELAXY RAINBOW",
                "Жевательная конфета Фрут-телла Ассорти", "Конфеты желейные с ароматом клубники JELAXY STRAWBERRY",
                "Конфеты желейные с ароматом колы JELAXY", "Конфета жев. Мусики (микс)", "Жевательные конфеты Mamba, ассорти ",
                "Жевательные конфеты ВЕВЕТО COOL BEANS BERRY MIX"};

        Random random = new Random();
        return allJellyCandy[random.nextInt(allJellyCandy.length)];
    }
}
