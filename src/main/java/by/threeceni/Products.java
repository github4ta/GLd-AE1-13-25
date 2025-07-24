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


    public static String getRandomChocolateCandy() {
        String[] chocolateCandies = {
                "Добрый злак с белым шоколадом",
                "Добрый Злак с белым шоколадом и вкусом вишни",
                "Шокозаврики",
                "Чудо-Чудное с какао Вишневый",
                "Конфеты со вкусом лесного ореха CHIQOLA Сердце",
                "Конфеты со вкусом лесного ореха CHIQOLA Треугольник",
                "Ozera c фундуком",
                "АЭРОФЛОТСКИЕ 35 гр",
                "Аленка 35 гр",
                "АЭРОФЛОТСКИЕ 200 гр",
                "Ярче",
                "Super с нугой и мягкой карамелью",
                "LOIS с клубничной нугой",
                "Крокант",
                "Ozera c ореховой начинкой",
                "Адель с цельным миндалем",
                "MILKIDS c молочной начинкой",
                "MILKIDS c молочно-клубничной начинкой",
                "Лукоморье",
                "Ozera суфле банан",
                "Baby Fox creamy choco",
                "Орешка",
                "Merci",
                "Рафаэлло"
        };

        Random random = new Random();
        int index = random.nextInt(chocolateCandies.length);
        return chocolateCandies[index];
    }
}
