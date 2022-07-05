import java.io.*;


public class TextHandler { 

    /*
     *  (C) ??
     */
	
    public TextHandler() {// Nothing needs to be put in here
    }

    public void process(int a) {

        client p = (client) server.playerHandler.players[a];

        // ---Start of prayer list---
        p.sendQuest("@whi@ Prayer", 687);
        p.sendQuest("@whi@", 2437);
        p.sendQuest("@gre@", 2438);
        p.sendQuest("@whi@", 2439);
        p.sendQuest("@whi@Attack Style :", 2427);
        p.sendQuest("@gre@Weapon: ", 2425);
        p.sendQuest("@gre@", 2440);
        p.sendQuest("@whi@Attack", 2441);
        p.sendQuest("@whi@Accurate", 2445);
        p.sendQuest("@whi@Defence", 2442);
        p.sendQuest("@gre@Strength", 2443);
        p.sendQuest("", 2444);
        p.sendQuest("", 2446);
        p.sendQuest("", 2447);
        p.sendQuest("", 2448);
        p.sendQuest("@whi@close", 1084);
        p.sendQuest("@gre@Smith it up!", 1117);

        p.sendQuest("@whi@Yes", 12466);
        p.sendQuest("@whi@No", 12467);

        p.sendQuest("@gre@Mouse Buttons", 918);
        p.sendQuest("@whi@Scary", 919);
        p.sendQuest("@whi@Reallife", 920);
        p.sendQuest("@whi@Bright", 921);
        p.sendQuest("@whi@V-Bright", 922);

        p.sendQuest("@gre@Mouse Buttons", 923);
        p.sendQuest("@whi@One", 925);
        p.sendQuest("@whi@Two", 924);
        p.sendQuest("@gre@Chat Effects", 926);
        p.sendQuest("@whi@On", 928);
        p.sendQuest("@whi@Off", 927);

        p.sendQuest("@whi@No", 960);
        p.sendQuest("@whi@Yes", 959);
        p.sendQuest("@gre@Split p Chat", 956);
        p.sendQuest("@whi@", 940);
        p.sendQuest("@whi@", 946);
        p.sendQuest("@whi@", 947);
        p.sendQuest("@whi@", 948);
        p.sendQuest("@whi@", 949);
        p.sendQuest("@whi@", 950);
        p.sendQuest(
                "@whi@ Players Online: "+PlayerHandler.getPlayerCount(), 174);

        p.sendQuest(" Change your Kicks mayn!", 3649);
        p.sendQuest("Rearrange mode:", 5390);
        p.sendQuest("Withdraw as -", 5388);
        p.sendQuest("Swap", 8133);
        p.sendQuest("Insert", 8132);
        p.sendQuest("Withdraw", 5389);
        p.sendQuest("Note", 5391);

        // Range
        p.sendQuest("", 4450);
        p.sendQuest("Accurate!", 1776);
        p.sendQuest("FAST!", 1777);
        p.sendQuest("DEF NUB RANGE", 1778);
        p.sendQuest("Attacking Style:", 1768);

        // staff
        p.sendQuest("@gre@Owning Style:", 332);
        p.sendQuest("@gre@Crush", 340);
        p.sendQuest("@whi@Crunch!", 341);
        p.sendQuest("@gre@Block that!", 342);
        p.sendQuest("@whi@attack with", 351);
        p.sendQuest("iN0n3!", 352);
        p.sendQuest("Ch00s3", 354);
        p.sendQuest("Sp3ll", 355);
        p.sendQuest("", 343);
        p.sendQuest("", 344);
        p.sendQuest("", 345);
        p.sendQuest("", 346);
        p.sendQuest("", 347);
        p.sendQuest("", 348);

        // IDK
        p.sendQuest("@gre@Owning Style:", 2427);
        p.sendQuest("@gre@Stab!", 2439);
        p.sendQuest("@whi@Smash!", 2438);
        p.sendQuest("@gre@Chop it up!", 2437);
        p.sendQuest("@whi@Blockit up!", 2440);
        p.sendQuest("", 2441);
        p.sendQuest("", 2442);
        p.sendQuest("", 2443);
        p.sendQuest("", 2444);
        p.sendQuest("", 2445);
        p.sendQuest("", 2446);
        p.sendQuest("", 2447);
        p.sendQuest("", 2448);

        // ----Friends & Ignores----
        p.sendQuest("@whi@Friends", 5067);
        p.sendQuest("@gre@Ignore", 5717);
        p.sendQuest("@whi@Add friend", 5070);
        p.sendQuest("@gre@Del friend", 5071);
        p.sendQuest("@whi@Add Ignore", 5720);
        p.sendQuest("@gre@Del Ignore", 5721);

        // ----Shop----
        p.sendQuest(
                "@whi@Right click to buy, Choose ammount you want, Click item for the price.",
                3903);

        // ----Bonuses----
        p.sendQuest("@gre@Attack bonus", 1673);
        p.sendQuest("@gre@Defence bonus", 1674); 
        p.sendQuest("@gre@Other bonuses", 1685);

        // Hands
        p.sendQuest("@gre@Choose Owning Style", 5858);
        p.sendQuest("@whi@Punchface!", 5866); 
        p.sendQuest("@gre@Kickass", 5867);
        p.sendQuest("@whi@Block", 5868);
        p.sendQuest("", 5869);
        p.sendQuest("", 5870);
        p.sendQuest("", 5871);
        p.sendQuest("", 5872);
        p.sendQuest("", 5873);
        p.sendQuest("", 5874);
        p.sendQuest("Weapon:", 5856);
        p.sendQuest("Spec", 7761);

        // barrows?
        p.sendQuest("@gre@Choose Owning Style", 5858);
        p.sendQuest("@whi@Punch!", 5866); 
        p.sendQuest("@gre@Kick", 5867);
        p.sendQuest("@whi@Block", 5868);
        p.sendQuest("", 5869);
        p.sendQuest("", 5870);
        p.sendQuest("", 5871);
        p.sendQuest("", 5872);
        p.sendQuest("", 5873);
        p.sendQuest("", 5874);
        p.sendQuest("Weapon:", 5856);
        p.sendQuest("KO HIM SPEC", 7761);

        // whip ****
        p.sendQuest("@gre@Choose Owning Style", 12294);
        p.sendQuest("@whi@Flick", 12302); 
        p.sendQuest("@gre@Lash", 12303);
        p.sendQuest("@whi@Deflect", 12304);
        p.sendQuest("", 12305);
        p.sendQuest("", 12306);
        p.sendQuest("", 12307);
        p.sendQuest("", 12308);
        p.sendQuest("", 12309);
        p.sendQuest("", 12310);
        p.sendQuest("Weapon:", 12292);

        p.sendFrame126("", 180);
        p.sendFrame126("@cya@Train", 181);
        p.sendFrame126("@red@Veng", 178);
        p.sendFrame126("@whi@Shops", 175);
        p.sendFrame126("@red@Vwild", 177);
        p.sendFrame126("@red@PKBox", 185);
        p.sendFrame126("@gre@Gwars", 186);
	p.sendFrame126("@gre@GSmini", 163);
        p.sendFrame126("@red@ Titans ", 179);
        p.sendFrame126("@gre@Slay", 187);
        p.sendFrame126("@cya@Skillz", 176);
        p.sendFrame126("@whi@cheer", 13371);
        p.sendFrame126("@whi@lean", 13372);
        p.sendFrame126("@whi@dance", 13373);
        p.sendFrame126("@whi@raspberry", 13374);
        p.sendFrame126("@whi@Fish", 13376);
        p.sendFrame126("", 13378);
        p.sendFrame126("", 13380);
        p.sendFrame126("", 13381);
        p.sendFrame126("", 13382);
        p.sendFrame126("", 11102);
        p.sendFrame126("", 13379);
        p.sendFrame126("", 13377);
        p.sendFrame126("", 13375);
        p.sendFrame126("", 11103);
        p.sendFrame126("@red@Off", 160);
        p.sendFrame126("@gre@On", 159);
        p.sendFrame126("@whi@Energy Left:", 148);
        p.sendFrame126("@whi@Run", 158);
        p.sendFrame126("@whi@Dragon teleports", 155);
        p.sendFrame126("@whi@Cape", 182);
        p.sendFrame126("@whi@Closewindow", 3902);
        p.sendFrame126("@whi@ D1", 157);
        p.sendFrame126("@whi@D2 @red@PK", 156);

        // --Ancients--
        p.sendQuest("@gre@Level 50 : Smoke Rush", 12941);
        p.sendQuest("@whi@A single target smoke attack", 12942);
        p.sendQuest("@gre@Level 52 : Shadow Rush", 12989);
        p.sendQuest("@whi@A single target shadow attack", 12990);
        p.sendQuest("@red@Fight Pits", 13037);
        p.sendQuest("@whi@teleport to a 1v1 Fun Fight", 13038);
        p.sendQuest("@gre@Level 56 : Blood Rush", 12903);
        p.sendQuest("@whi@A single target blood attack", 12904);
        p.sendQuest("@gre@Level 58 : Ice Rush", 12863);
        p.sendQuest("@whi@A single target ice attack", 12864);
        p.sendQuest("@red@PK Bank", 13047);
        p.sendQuest("@whi@teleport to MB", 13048);
        p.sendQuest("@gre@Level 62 : Smoke Burst", 12965);
        p.sendQuest("@whi@A multi-target smoke attack", 12966);
        p.sendQuest("@gre@Level 64 : Shadow Burst", 13013);
        p.sendQuest("@whi@A multi-target shadow attack", 13014);
        p.sendQuest("@red@PK Shack", 13055);
        p.sendQuest("@whi@teleport to the club at PK", 13056);
        p.sendQuest("@gre@Level 68 : Blood Burst", 12921);
        p.sendQuest("@whi@A multi-target blood attack", 12922);
        p.sendQuest("@gre@Level 70 : Ice Burst", 12883);
        p.sendQuest("@whi@A multi-target ice attack", 12884);
        p.sendQuest("@red@Castle Wars", 13063);
        p.sendQuest("@whi@teleport to Castle Wars Lobby", 13064);
        p.sendQuest("@gre@Level 74 : Smoke Blitz", 12953);
        p.sendQuest("@whi@A single target strong smoke attack", 12954);
        p.sendQuest("@gre@Level 76 : Shadow Blitz", 13001);
        p.sendQuest("@whi@A single target strong shadow attack", 13002);
        p.sendQuest("@gre@Titans", 13071);
        p.sendQuest("@whi@teleport to the titans", 13072);
        p.sendQuest("@gre@Level 80 : Blood Blitz", 12913);
        p.sendQuest("@whi@A single target strong blood attack", 12914);
        p.sendQuest("@gre@Level 82 : Ice Blitz", 12873);
        p.sendQuest("@whi@A single target strong ice attack", 12874);
        p.sendQuest("@gre@Godwars", 13081);
        p.sendQuest("@whi@Teleport to godwars", 13082);
        p.sendQuest("@gre@Level 86 : Smoke Barrage", 12977);
        p.sendQuest("@whi@A multi-target strong smoke attack", 12978);
        p.sendQuest("@gre@Level 88 : Shadow Barrage", 13025);
        p.sendQuest("@whi@A multi-target strong shadow attack", 13026);
        p.sendQuest("@gre@God Sword Mini-Game", 13089);
        p.sendQuest("@whi@Teleport to GS minigame", 13090);
        p.sendQuest("@gre@Level 92 : Blood Barrage", 12931);
        p.sendQuest("@whi@A multi-target strong blood attack", 12932);
        p.sendQuest("@gre@Level 94 : Ice Barrage", 12893);
        p.sendQuest("@whi@The power of god", 12894);
        p.sendQuest("Church", 13097);
        p.sendQuest("@whi@Teleport to the Varrok Alter", 13098);

        // --Modern--
        p.sendQuest("@gre@Level 1 : Wind Strike", 1200);
        p.sendQuest("@whi@A basic Air missile", 1201);
        p.sendQuest("@gre@Level 3 : Confuse", 1207);
        p.sendQuest("@whi@Reduces your target's attack by 5%", 1208);
        p.sendQuest("@gre@Level 5 : Water Strike", 1216);
        p.sendQuest("@whi@A basic Water missile", 1217);
        p.sendQuest("@gre@Level 7 : Lvl-1 Enchant", 1225);
        p.sendQuest("@whi@For use on sapphire jewellery", 1226);
        p.sendQuest("@gre@Level 9 : Earth Strike", 1232);
        p.sendQuest("@whi@A basic Earth missile", 1233);
        p.sendQuest("@gre@Level 11 : Weaken", 1241);
        p.sendQuest("@whi@Reduces your target's str by 5%", 1242);
        p.sendQuest("@gre@Level 13 : Fire Strike", 1250);
        p.sendQuest("@whi@A basic Fire missile", 1251);
        p.sendQuest("@gre@Level 15 : Bones to Bananas", 1259);
        p.sendQuest("@whi@Changes held bones to bananas", 1260);
        p.sendQuest("@gre@Level 17 : Wind Bolt", 1268);
        p.sendQuest("@whi@A low level Air missile", 1269);
        p.sendQuest("@gre@Level 19 : Curse", 1275);
        p.sendQuest("@whi@Reduces your target's def by 5%", 1276);
        p.sendQuest("@gre@Level 20 : Bind", 1574);
        p.sendQuest("@whi@Holds you target for 5 seconds", 1575);
        p.sendQuest("@gre@Level 21 : Low Level Alchemy", 1284);
        p.sendQuest("@whi@Converts an item into gold", 1285);
        p.sendQuest("@gre@Level 23 : Water Bolt", 1291);
        p.sendQuest("@whi@A low level Water missile", 1292);
        p.sendQuest("@gre@Teleporting Spell", 1300);
        p.sendQuest("@whi@Teleports you to varrock.", 1301);
        p.sendQuest("@gre@Level 27 : Lvl-2 Enchant", 1309);
        p.sendQuest("@whi@For use on emerald jewellery", 1310);
        p.sendQuest("@gre@Level 29 : Earth Bolt", 1316);
        p.sendQuest("@whi@A low level Earth missile", 1317);
        p.sendQuest("@gre@Teleporting Spell", 1325);
        p.sendQuest("@whi@teleports you to lumby. ", 1326);
        p.sendQuest("@gre@Level 33 : Telekinetic Grab", 1334);
        p.sendQuest("@whi@Take an item you can't reach", 1336);
        p.sendQuest("@gre@Level 35 : Fire Bolt", 1341);
        p.sendQuest("@whi@A low level Fire missile", 1342);
        p.sendQuest("@gre@Teleporting Spell", 1350);
        p.sendQuest("@whi@", 1351);
        p.sendQuest("@gre@Level 39 : Crumble Undead", 1359);
        p.sendQuest("@whi@Hits un-dead monsters hard", 1360);
        p.sendQuest("@gre@Level 41 : Wind Blast", 1368);
        p.sendQuest("@whi@A medium level Wind missile", 1369);
        p.sendQuest("@gre@Level 43 : Superheat Item", 1375);
        p.sendQuest("@whi@Smelt ore without a furnace", 1376);
        p.sendQuest("@gre@Teleporting Spell", 1382);
        p.sendQuest("@whi@", 1383);
        p.sendQuest("@gre@Level 47 : Water Blast", 1389);
        p.sendQuest("@whi@A medium level Water missile", 1390);
        p.sendQuest("@gre@Level 49 : Lvl-3 Enchant", 1398);
        p.sendQuest("@whi@For use on ruby jewellery", 1399);
        p.sendQuest("@gre@Level 50 : Iban Blast", 1405);
        p.sendQuest("@whi@Summons the wrath of Iban", 1406); // Iban blast
        p.sendQuest("@gre@Level 50 : Snare", 1584);
        p.sendQuest("@whi@Holds your target for 10 seconds", 1585);
        p.sendQuest("@gre@Level 50 : Magic Dart", 12039); // Magic dart
        p.sendQuest("@whi@A magic dart of slaying", 12040);
        p.sendQuest("@gre@Teleporting Spell", 1415);
        p.sendQuest("@whi@", 1416);
        p.sendQuest("@gre@Level 53 : Earth Blast", 1422);
        p.sendQuest("@whi@A medium level Earth missile", 1423);
        p.sendQuest("@gre@Level 55 : High Level Alchemy", 1431);
        p.sendQuest("@whi@Converts an item into more gold", 1432);
        p.sendQuest("@gre@Level 56 : Charge Water Orb", 1438);
        p.sendQuest("@whi@Cast on a Water obelisk", 1439);
        p.sendQuest("@gre@Level 57 : Lvl-4 Enchant", 1447);
        p.sendQuest("@whi@For use on diamond jewellery", 1448);
        p.sendQuest("@gre@Teleporting Spell", 1454);
        p.sendQuest("@whi@", 1455);
        p.sendQuest("@gre@Level 59 : Fire Blast", 1461);
        p.sendQuest("@whi@A medium level Fire missile", 1462);
        p.sendQuest("@gre@Level 60 : Charge Earth Orb", 1470);
        p.sendQuest("@whi@Cast on a Earth obelisk", 1471);
        p.sendQuest("@gre@Level 60 : Ores to Bars", 15879);
        p.sendQuest("@whi@Turns Ores Into Bars", 15880);
        p.sendQuest("@gre@Level 99 : Saradomin Strike", 1603); // Saradomin Strike
        p.sendQuest("@whi@The power of Saradomin", 1604);
        p.sendQuest("@gre@Level 99 : Claws of Guthix", 1614); // Claws of Guthix
        p.sendQuest("@whi@The power of Guthix", 1615);
        p.sendQuest("@gre@Level 99 : Flames of Zamorak", 1625); // Flames of Zamorak
        p.sendQuest("@whi@The power of Zamorak", 1626);
        p.sendQuest("@gre@Teleporting Spell", 7457);
        p.sendQuest("@whi@", 7458);
        p.sendQuest("@gre@Level 62 : Wind Wave", 1479);
        p.sendQuest("@whi@A high level Air missile", 1480);
        p.sendQuest("@gre@Level 63 : Charge Fire Orb", 1486);
        p.sendQuest("@whi@Cast on a Fire obelisk", 1487);
        p.sendQuest("@gre@Teleporting Spell", 18472);
        p.sendQuest("@whi@", 18473);
        p.sendQuest("@gre@Level 65 : Water Wave", 1495);
        p.sendQuest("@whi@A high level Water missile", 1496);
        p.sendQuest("@whi@Level 66 : Charge Air Orb", 1504);
        p.sendQuest("@whi@Cast on a Air obelisk", 1505);
        p.sendQuest("@gre@Level 66 : Vulnerability", 1513);
        p.sendQuest("@whi@Reduces your target's def by 10%", 1514);
        p.sendQuest("@gre@Level 68 : Lvl-5 Enchant", 1522);
        p.sendQuest("@whi@For use on dragonstone jewellery", 1523);
        p.sendQuest("@gre@Level 70 : Earth Wave", 1531);
        p.sendQuest("@whi@A high level Earth missile", 1532);
        p.sendQuest("@gre@Level 73 : Enfeeble", 1545);
        p.sendQuest("@whi@Reduces your target's str by 10%", 1546);
        p.sendQuest("@gre@Teleporting Spell", 12427); // Teleother Lumbridge
        p.sendQuest("@whi@", 12428);
        p.sendQuest("@gre@Level 75 : Fire Wave", 1554);
        p.sendQuest("@whi@A high level Fire missile", 1555);
        p.sendQuest("@gre@Level 79 : Entangle", 1594);
        p.sendQuest("@whi@Holds your target for 15 seconds", 1595);
        p.sendQuest("@gre@Level 80 : Stun", 1564);
        p.sendQuest("@whi@Reduces your target's att by 10%", 1565);
        p.sendQuest("@gre@Level 80 : Charge", 1636);
        p.sendQuest("@whi@Charges God spells", 1637);
        p.sendQuest("@gre@Teleporting Spell", 12437); // Teleother Falador
        p.sendQuest("@whi@", 12438);
        p.sendQuest("@gre@Teleporting Spell", 12447);
        p.sendQuest("@whi@", 12448);
        p.sendQuest("@gre@Level 87 : Lvl-6 Enchant", 6005);
        p.sendQuest("@whi@For use on onyx jewellery", 6006);
        p.sendQuest("@gre@Teleporting Spell", 12457); // Teleother Camelot
        p.sendQuest("@whi@", 12458);
        p.sendQuest("@whi@Attack XP:", 4042);
        p.sendQuest("@whi@Next Lvl At:", 4043);
        p.sendQuest("@whi@Strength XP:", 4048);
        p.sendQuest("@whi@Next Lvl At:", 4049);
        p.sendQuest("@whi@Defence XP:", 4054);
        p.sendQuest("@whi@Next Lvl At:", 4055);
        p.sendQuest("@whi@Ranged XP:", 4060);
        p.sendQuest("@whi@Next Lvl At:", 4061);
        p.sendQuest("@whi@Prayer XP:", 4066);
        p.sendQuest("@whi@Next Lvl At:", 4067);
        p.sendQuest("@whi@Magic XP:", 4072);
        p.sendQuest("@whi@Next Lvl At:", 4073);
        p.sendQuest("@whi@Runecraft XP:", 4155);
        p.sendQuest("@whi@Next Lvl At:", 4156);
        p.sendQuest("@whi@Hitpoints XP:", 4078);
        p.sendQuest("@whi@Next Lvl At:", 4079);
        p.sendQuest("@whi@Agility XP:", 4084);
        p.sendQuest("@whi@Next Lvl At:", 4085);
        p.sendQuest("@who@Herblore XP:", 4090);
        p.sendQuest("@whi@Next Lvl At:", 4091);
        p.sendQuest("@whi@Theiving XP:", 4096);
        p.sendQuest("@whi@Next Lvl At:", 4097);
        p.sendQuest("@whi@Crafting XP:", 4102);
        p.sendQuest("@whi@Next Lvl At:", 4103);
        p.sendQuest("@whi@Fletching XP:", 4108);
        p.sendQuest("@whi@Next Lvl At:", 4109);
        p.sendQuest("@whi@Slayer XP:", 12169);
        p.sendQuest("@whi@Next Lvl At:", 12170);
        p.sendQuest("@whi@Mining XP:", 4114);
        p.sendQuest("@whi@Next Lvl At:", 4115);
        p.sendQuest("@whi@Smihing XP:", 4120);
        p.sendQuest("@whi@Next Lvl At:", 4121);
        p.sendQuest("@whi@Fishing XP:", 4126);
        p.sendQuest("@gre@Next Lvl At:", 4127);
        p.sendQuest("@whi@Cooking XP:", 4132);
        p.sendQuest("@whi@Next Lvl At:", 4133);
        p.sendQuest("@whi@Firemaking XP:", 4138);
        p.sendQuest("@whi@Next Lvl At:", 4139);
        p.sendQuest("@whi@Woodcutting XP:", 4144);
        p.sendQuest("@whi@Next Lvl At:", 4145);
        p.sendQuest("@whi@Farming XP:", 13919);
        p.sendQuest("@whi@Next Lvl At:", 13920);

    }
}
