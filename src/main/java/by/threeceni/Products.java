package by.threeceni;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Products {

    public static String getRandomNameJellyCandy() {
        String[] allJellyCandy = {"МЯГКИЕ ФРУКТОВЫЕ КОНФЕТЫ с фруктовым соком Фруктовый сад",
                "Конфета жев. Жуй Жуйсы (микс)",
                "Жевательная конфета \"Фрутти\" с ароматом клубники",
                "Жевательная конфета YUPO METRE LIQ со вкусом Арбуз",
                "Мягкие фруктовые конфеты с фруктовым соком «ЮПО ЧЕРВИ»",
                "Желейные конфеты \"JELLY CANDY\" (egg)",
                "Конфеты с желейными корпусами глазированные «Желейные» со вкусом вишни",
                "Конфеты желейные радуга JELAXY RAINBOW",
                "Жевательная конфета Фрут-телла Ассорти",
                "Конфеты желейные с ароматом клубники JELAXY STRAWBERRY",
                "Конфеты желейные с ароматом колы JELAXY",
                "Конфета жев. Мусики (микс)", "Жевательные конфеты Mamba, ассорти ",
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

    public static String getRandomGreenTeaBagged() {
        String[] greenteas = {
                "Напиток чайный Ромашка с мелиссой 20г.",
                "Чай зеленый ГринФилд Melissa 25 пак.",
                "Чайный напиток \"Вечерний сбор\" 25 пак. с ярл."};

        Random random = new Random();
        return greenteas[random.nextInt(greenteas.length)];
    }

    public static String getRandomSpiceProduct() {
        String[] spice = {
                "\"Кисель со вкусом и ароматом вишни\" 20 гр",
                "\"Кисель со вкусом и ароматом клюквы\" 20 гр.",
                "Бульон куриный 100г",
                "Ванилин порошок 1г.",
                "Гвоздика цельная 10г",
                "Д-Р БЕЙКЕРС Ароматизатор Ванилин-интенсив 2г",
                "Д-Р БЕЙКЕРС Дрожжи быстродейств., 7г",
                "Д-р Бейкерс Разрыхлитель теста 10г",
                "Дрожжи \"Эстетика Вкуса\" 11г.",
                "Желатин пищевой, 15 гр",
                "Концентраты пищевые. Сладкие блюда. «Глазурь БЕЛАЯ», 75 гр",
                "Концентраты пищевые. Сладкие блюда. «Глазурь Розовая», 75 гр",
                "Корица молотая, 15 гр",
                "Лавровый лист целый 10 г",
                "Лимонная кислота, 100 гр",
                "Магги \"Кухня Идей\" румяная курица 30г",
                "МАК ПИЩЕВОЙ \"ДОБРАЯ ЖОНКА\" 100Г",
                "Мак пищевой, 100 гр",
                "Начинка маковая с сухофруктами 380 г HELCOM",
                "Перец черный горошек 10г",
                "Перец черный молотый 10г",
                "Посыпка кондитерская Пряный дом \"Микс\", 15 г",
                "Приправа для шашлыка 15г",
                "Приправа сухая \"Универсальная\", 200 гр",
                "Приправа универсальная \"Kucharek\" 200 г",
                "Разрыхлитель теста \"Престиж\" 20г",
                "Семена кунжута, 15 гр",
                "Смесь перцев 15г",
                "Смесь сухая для глинтвейна 25г",
                "Хмели-сунели 15г",
                "Чеснок сушеный гранулы 10 гр ТМ Мастер Дак"
        };

        Random random = new Random();
        return spice[random.nextInt(spice.length)];
    }

    public static String getNameSectionCoffeePowdered() {
        List<String> COFFEE_POWDERED = Arrays.asList(
                "Нескафе 3в1 РАФ 17г",
                "Кофейный напит. раст. Nescafe 3в1 Карамель 14,5г стик",
                "Кофе Нескафе Голд Арома 85г",
                "Кофе Нескафе Голд пакет 130г",
                "Кофе Нескафе Голд пакет 85г",
                "Кофе натурю раст. сублим.JACOBS GOLD 130г",
                "Напиток кофейный раств. NESCAFE CLASSIC CAPPUCCINO 18г стик",
                "Напиток кофейный раств. NESCAFE CLASSIC LATTE 18г стик",
                "Кофе Нескафе Классик пакет 130г",
                "Напиток кофейный растворимый NESCAFE 3d1 Мягкий 14,5г стик",
                "Напиток кофейный раствор. NESCAFE 3d1 Крепкий 14,5г стик",
                "Напиток кофейный раствор. NESCAFE 3d1 Классический 14,5г стик",
                "Кофе раств.субл." + "'LEBO GOLD'" + "," + "cт/б 100г",
                "Цирконий порошок EL PASSA ZIP 100г",
                "Кофе растворимый Жокей Триумф ст/б 95г",
                "Кофе Нескафе Голд Арома Интенсщ пакет 120г",
                "Кофе раств. Nescafe Classic Crema 95 cn/б",
                "Кофейню напиток растворимый сублим. LA SORA ZIP 200г",
                "Кофе Нескафе Классик пакет 60г");

        return COFFEE_POWDERED.get(ThreadLocalRandom.current().nextInt(COFFEE_POWDERED.size()));
    }

    public static String getRandomCookieName() {
        String[] cookieNames = {
                "Печенье «Bonitki» сдобное с шоколадными каплями 135 г",
                "Печенье-сэндвич «Tondi» с какао и молочным кремом 204 г",
                "Крекер «TUC» со вкусом сметаны и лука 100 г",
                "Крекер «TUC» со вкусом краба 100 г",
                "Крекер «TUC» со вкусом сыра 100 г",
                "Печенье «Яшкино» сдобное с каплями глазури 180 г",
                "Печенье «Oreo» с какао и начинкой со вкусом ванили 95 г",
                "Печенье «Belvita» утреннее мультизлаковое 225 г",
                "Печенье «Choco Pie» 168 г",
                "Печенье «Юбилейное» традиционное 112 г",
                "Печенье «Choco-loco» глазированное с начинкой со вкусом кокоса 130 г",
                "Печенье «Alpen Gold» Chocolife с кусочками темного шоколада 126 г",
                "Печенье-сэндвич «Супер-Контик» с орехом 100 г",
                "Трубочки вафельные «Яшкино» со сгущенным молоком 190 г",
                "Печенье сахарное «Слодыч» К полднику 150 г",
                "Вафли «Яшкино» глазированные с орешками 200 г",
                "Печенье «Mirella» сахарное со вкусом топлёного молока 500 г",
                "Печенье «Завтрак папуаса» сахарное с кокосовой стружкой 180 г"
        };

        Random random = new Random();
        int index = random.nextInt(cookieNames.length);
        return cookieNames[index];
    }

    public static String getRandomBlackTeaBagged() {
        String[] blackTeaBagged = {
                "Чай черный Кёртис Sunny Lemon (Curtis) 20пак.",
                "Чай черный Shenly байховый 25 пак.",
                "Чай Richard черный Lord Grey бергамот 25п",
                "Чай черный с ароматом \"Лесная ягода\", т.з. \"Престиж\", 24г.(20 ф/п *1,2г.б/ярл)",
                "Чай черный пакетированный т.з. \"Престиж\", 150г.(100ф/п * 1,5г б/ярл.)\n",
                "Чай Кёртис Blue Berries Blues (Curtis) 20пак.\n",
                "Чай Лисма Крепкий brown 25 пак.\n",
                "Чай Curtis ассорти \"Dessert Tea Collection\", 30 пак.\n",
                "Чай черный ГринФилд Spring Melody 25 пак.\n",
                "Чай черный Тесс Sunrise 100пак., 1,8г\n",
                "Подарочный набор чая Curtis \"Winter Tea Set\", 24 пак.\n",
                "Чай Richard черный Royal Berries Selection с добавками 25 пак\n",
                "Чайный напиток ГринФилд Summer Bouguet трав. 25 пак.\n",
                "Чай черный ГринФилд Golden Ceylon 25 пак.\n",
                "Чай черный с доб. ТЕСС Карамель Шарм 20 пир.\n"
        };

        Random random = new Random();
        return blackTeaBagged[random.nextInt(blackTeaBagged.length)];
    }

    public static String getRandomCaramel() {
        String[] candyNames = {
                "Карамель Sla Sti \"Кислоп\" Микс (яблоко, вишня, черника) 200г",
                "Набор карамели \"Акконд\" \"Рози блюз\" 150г",
                "Карамель на палочке в наборе с подарком \"Лизунец MAXI Аниме Клаб\" 112г",
                "Карамель Лизунец MAXI для девочек 125г",
                "Карамель Лизунец MAXI для мальчиков 125г",
                "Карамель на светящейся палочке Люмик MIX 70гр",
                "Карамель леденцовая \"Цыпленок\" 40г",
                "Карамель леденц. атл. \"Яйцо\" в короб. 30г",
                "Карамель \"Рачки с арахисом\" 150г",
                "Карамель леденцовая \"Сердечко\" 30г",
                "Карамель с начинкой фруктового вкуса «Леденцовое ассорти с соком» 500г",
                "Карамель леденцовая \"Арбузик\" (cо вкусом арбуза) 25 г",
                "Карамель леденцовая \"Соска\" (cо вкусом винограда, яблока) 8г",
                "Карамель Чупа Чупс «Мини» ассорти 90г",
                "Карамель со вкусом Эвкалипт-Ментол 150г",
                "Кар.Страйк двойные вк 11.3г",
                "Карам. с фрукт. нач. \"Жевательное ассорти\", 500г",
                "Карамель Страйк кисл пакет, 113г",
                "Карамель с шипуч.начинкой Крут Фрут ассорти, 500г",
                "Леденцовая карамель на палочке \"Елка\"стойка, 30г",
                "Карамель леденцовая \"Фруктовые сказки\" ассорти 100г",
                "Карамель \"ВЗРЫВ МОЗГА\" со вкусом арбуза и колы 3г",
                "Леденцовая карамель \"Трость\" 30гр",
                "Карамель леденцовая Маргаритка 35г",
                "Карамель леденцовая Губки 30г"
        };

        Random random = new Random();
        int randomIndex = random.nextInt(candyNames.length);
        return candyNames[randomIndex];
    }

    public static boolean containsCream(Product product) {
        if (product.getName().toLowerCase().contains("крем")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasNameCrackerOrCookie(Product product) {
        if (product.getName().toLowerCase().contains("печенье") || product.getName().toLowerCase().contains("крекер")) {
            return true;
        }

        return false;
    }

    public static boolean containsCaramel(Product product) {
        return product.getName().toLowerCase().contains("карамель");
    }

    public static boolean containsTea(Product product) {
        return product.getName().toLowerCase().contains("чай");
    }

    public static boolean isFrozenDessert(Product product) {
        String name = product.getName().toLowerCase();

        return name.contains("мороженое") ||
                (name.contains("десерт") && name.contains("замороженный"));
    }

    public static boolean isNameCoffee(Product product) {
        return product.getName().toLowerCase().contains("кофе");
    }

    public static boolean hasNameCandy(Product product) {
        if (product == null || product.getName() == null) {
            return false;
        }
        String lowerCaseName = product.getName().toLowerCase();
        return lowerCaseName.contains("конфеты") || lowerCaseName.contains("конфета");
    }

    public static boolean hasNameGlasses(Product product) {
        return product.getName().toLowerCase().contains("очки");
    }

    public static int getProductCountByKeyword(List<Product> productList, String keyword) {
        keyword = keyword.toLowerCase();
        int counter = 0;

        for (Product p : productList) {
            String name = p.getName();
            if (name.toLowerCase().contains(keyword)) {
                counter++;
            }
        }

        return counter;
    }

    public static int getProductCountForTea(List<Product> productList) {
        return getProductCountByKeyword(productList, "чай");
    }

    public static int countCremProduct(List<Product> products) {
        String wantedProduct = "крем";
        long count = 0;
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(wantedProduct)) {
                count++;
            }
        }
        return Math.toIntExact(count);
    }

    public static int getNumberOfSweets(List<Product> productList) {
        int counter = 0;
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains("конфета") || product.getName().toLowerCase().contains("конфеты")) {
                counter++;
            }
        }
        return counter;
    }

    public static int getNumberOfCrackerAndCookie(List<Product> products) {
        int count = 0;
        for (Product product : products) {
            if (hasNameCrackerOrCookie(product)) {
                count++;
            }
        }
        return count;
    }

    public static int countCaramelProducts(List<Product> productList) {
        int caramelCount = 0;
        String keyword = "карамель";

        for (Product product : productList) {
            if (product.getName() != null && product.getName().toLowerCase().contains(keyword)) {
                caramelCount++;
            }
        }
        return caramelCount;
    }

    public static int getNumberOfFrozen(List<Product> productList) {
        int counter = 0;
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains("мороженное") || product.getName().toLowerCase().contains("десерт") && product.getName().toLowerCase().contains("замороженный")) {
                counter++;
            }
        }
        return counter;
    }
}
