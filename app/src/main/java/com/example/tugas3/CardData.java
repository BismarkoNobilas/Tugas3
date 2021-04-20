package com.example.tugas3;

import java.util.ArrayList;

public class CardData {
    private static String[] appNames = {
            "Dota 2",
            "Genshin Impact",
            "Soul Knight",
            "PUBG Mobile",
            "Mobile Legends",
            "L.O.L. : Wild Rift",
            "Zynga Poker",
            "Stardew Vallew",
            "Chess.com",
            "Otherworld Legends"
    };

    private static String[] appDetails = {
            "Dota 2 is a multiplayer online battle arena (MOBA) video game developed and published by Valve. The game is a sequel to Defense of the Ancients (DotA), which was a community-created mod for Blizzard Entertainment's Warcraft III: Reign of Chaos. Dota 2 is played in matches between two teams of five players, with each team occupying and defending their own separate base on the map. Each of the ten players independently controls a powerful character, known as a \"hero\", who all have unique abilities and differing styles of play. During a match players collect experience points and items for their heroes to successfully defeat the opposing team's heroes in player versus player combat. A team wins by being the first to destroy the other team's \"Ancient\", a large structure located within their base.",
            "Genshin Impact is an action role-playing game developed and published by miHoYo. The game features an open-world environment and action-based battle system using elemental magic and character-switching, and uses gacha game monetization for players to obtain new characters, weapons, and other resources. The game is online-only and features a limited multiplayer mode allowing up to four players to play together.",
            "Soul Knight is a game made by ChillyRoom Inc. © for Android, iOS, and Nintendo Switch, released as of 17th February 2017. The current version of the game is 3.1.0, released on 13th April 2021 on Android and iOS. Soul Knight is inspired by the game Enter The Gungeon (a bullet-hell rogue-lite game produced by Dodge Roll and Devolver Digital).",
            "PUBG MOBILE is a Battle Royale mobile game created independently by Lightspeed & Quantum Studios of Tencent Game, officially licensed by PLAYERUNKNOWN’S BATTLEGROUNDS. It was released globally in March 2018. Built with Unreal Engine 4, PUBG MOBILE focuses on visual quality, maps, shooting experience, and other aspects, providing an all-rounded surreal Battle Royale experience to players. A hundred players will land on the battleground to begin an intense yet fun journey. Each player is required to scavenge survival supplies, as well as to exploit the maximum potential of the map terrain, vehicles, and items to become the last team standing on the battleground. Check your heartbeat and be on guard as the playzone begins to shrink.",
            "Mobile Legends: Bang Bang is a multiplayer online battle arena (MOBA) game designed for mobile phones. The two opposing teams fight to reach and destroy the enemy's base while defending their own base for control of a path, the three \"lanes\" known as \"top\", \"middle\", and \"bottom\", which connects the bases. Weaker computer-controlled characters, called \"minions\", spawn at team bases and follow the three lanes to the opposite team's base, fighting enemies and turrets. There are five players who each control a character in each team, known as a \"hero\" using analog/joystick controls. Heroes can be grouped into 6 different roles, Marksman, Assassin, Mage, Support, Fighter, and Tank. Additionally, Mobile Legends: Bang Bang has many game modes with different gameplay mechanics.",
            "League of Legends: Wild Rift (abbreviated LoL: WR or simply Wild Rift) is a multiplayer online battle arena mobile game developed and published by Riot Games for Android and iOS. The game is a modified version of the PC game League of Legends. League of Legends: Wild Rift is a multiplayer online battle arena (MOBA) game in the three-dimensional isometric perspective. Players compete in matches, lasting anywhere from 15 to 20 minutes on average. Teams work together to destroy a structure called the Nexus in the enemy team's base, bypassing a line of defensive structures called turrets.",
            "Zynga Poker is a social game developed by Zynga as an application for the social-networking website Facebook as well as Android, iPhone, Windows Phone, Windows, MySpace, Tagged, and Google+. The game allows Facebook players to simulate playing Texas Hold 'em poker in a social gaming environment. Users enter a casino lobby and can play at any table or join friends for a game. Players choose from casual tables, tournament play, or VIP tables. A leader board shows players how they compare in chip ranking to other players and allows players to send or receive gifts.",
            "Stardew Valley is a simulation role-playing video game developed by Eric \"ConcernedApe\" Barone. It was released for Microsoft Windows in February 2016, and later for macOS, Linux, PlayStation 4, Xbox One, Nintendo Switch, PlayStation Vita, iOS, and Android. Stardew Valley is a farming simulation game primarily inspired by the Harvest Moon video game series. At the start of the game, players create their character, who becomes the recipient of a plot of land and a small house once owned by their grandfather in a small town called Pelican Town. Players may select from several different farm map types, each having benefits and drawbacks. The farm plot is initially overrun with boulders, trees, stumps, and weeds, and players must work to clear them in order to restart the farm, tending to crops and livestock so as to generate revenue and further expand the farm's buildings and facilities.",
            "Chess.com is an internet chess server, internet forum and social networking website. The site has a freemium model in which some features are available for free, and others for accounts with subscriptions. Live online chess can be played against other users at daily, rapid, blitz or bullet time controls, with a number of chess variants available. Chess versus an AI, computer analysis, chess puzzles and teaching resources are also offered.",
            "Otherworld Legends is an action-packed roguelite where you explore strange and dangerous worlds as you try to discover the secret hidden in this mysterious and magical kingdom. To do so, you'll need equal amounts of skill and persistence. Gameplay in Otherworld Legends is perfect for touch screens."
    };

    private static String[] appImages = {
            "https://i.pinimg.com/originals/e6/99/fb/e699fb7cd6ce72d00445fac66fdfc997.jpg",
            "https://image.winudf.com/v2/image1/Y29tLm1pSG9Zby5HZW5zaGluSW1wYWN0X2ljb25fMTU5NzcyNzMyOF8wOTA/icon.png?w=&fakeurl=1",
            "https://play-lh.googleusercontent.com/h3yAZGZ0pnxcdYChYk_y2zb58skydrosTmIewnZ6a8inL3_IXottlUXC5KnpSawemA=s180-rw",
            "https://www.pubgmobile.com/common/images/icon_logo.jpg",
            "https://i.pinimg.com/736x/c9/13/7e/c9137e7a2879f90e22df9fc5cd3bf85f.jpg",
            "https://play-lh.googleusercontent.com/ccEdrJrnaokanhq_VTOMU4u82aFkPVeAYwY5rLvWzFh0GjKXT0U6hNcu4ZXsWw3H2yU",
            "https://lh3.googleusercontent.com/JYfNHIlJVGCnAwZx1XexiunJMStcZYyBRe6ERMGec8W9YHmxeJdKxUHJ_qFvzxMU7Q",
            "https://data.apksum.com/89/com.chucklefish.stardewvalley/1.14/icon.png",
            "https://is4-ssl.mzstatic.com/image/thumb/Purple124/v4/0e/2f/a8/0e2fa861-34f5-e504-792a-aa8914edb5e8/source/256x256bb.jpg",
            "https://www.apkdlmod.com/wp-content/uploads/2020/08/otherworld-legends.jpg"
    };


    private static String[] link = {
            "https://store.steampowered.com/app/570/Dota_2/",
            "https://play.google.com/store/apps/details?id=com.miHoYo.GenshinImpact&hl=en&gl=US",
            "https://play.google.com/store/apps/details?id=com.ChillyRoom.DungeonShooter&hl=en&gl=US",
            "https://play.google.com/store/apps/details?id=com.tencent.ig&hl=en&gl=US",
            "https://play.google.com/store/apps/details?id=com.mobile.legends&hl=en&gl=US",
            "https://play.google.com/store/apps/details?id=com.riotgames.league.wildrift&hl=en&gl=US",
            "https://play.google.com/store/apps/details?id=com.zynga.livepoker&hl=en&gl=US",
            "https://store.steampowered.com/app/413150/Stardew_Valley/",
            "https://play.google.com/store/apps/details?id=com.chess&hl=en&gl=US",
            "https://play.google.com/store/apps/details?id=com.chillyroom.zhmr.gp&hl=en&gl=US"
    };

    static ArrayList<Card> getListData() {
        ArrayList<Card> list = new ArrayList<>();

        for (int position = 0; position < appNames.length; position++) {
            Card card = new Card();
            card.setsName(appNames[position]);
            card.setsDetail(appDetails[position]);
            card.setsPhoto(appImages[position]);
            card.setsLink(link[position]);
            list.add(card);
        }
        return list;
    }
}
