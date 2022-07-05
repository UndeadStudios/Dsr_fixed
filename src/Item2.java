// This file is free software; you can redistribute it and/or modify it under
// the terms of the GNU General Public License version 2, 1991 as published by
// the Free Software Foundation.

// This program is distributed in the hope that it will be useful, but WITHOUT
// ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
// FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
// details.

// A copy of the GNU General Public License can be found at:
// http://www.gnu.org/licenses/gpl.html

// a collection of item methods
import java.io.*;


public class Item2 {
    public static int runerock[] = {
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 1481, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451};

    public static int randomRuneRock() {
        return runerock[(int) (Math.random() * runerock.length)];
    }	

  public static int starcraft[] = {
        1038, 1040, 1042, 1044, 1046, 1048};

    public static int randomstarcraft() {
        return starcraft[(int) (Math.random() * starcraft.length)];
    }	


    public static int coalrock[] = {
        453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453,
        453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453,
        453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453,
        453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453,
        453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453,
        453, 453, 453, 453, 453, 453, 1481, 453, 453, 453, 453, 453, 453, 453,
        453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453,
        453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453,
        453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453,
        453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453,
        453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453,
        453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453,
        453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453,
        453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453, 453,
        453, 453, 453, 453, 453, 453};

    public static int randomCoalRock() {
        return coalrock[(int) (Math.random() * coalrock.length)];
    }

    public static int kitchendrawers[] = {
         1617, 1617, 1617, 1617, 1617, 1617, 1617, 1617, 1617, 1617,
         1619, 1619, 1619, 1619, 1619, 1619, 1619, 1619, 1619, 1619, 1619, 1619, 1619, 1619, 1619,
         1621, 1621, 1621, 1621, 1621, 1621, 1621, 1621, 1621, 1621, 1621, 1621, 1621, 1621, 1621, 1621, 1621, 1621, 1621, 1621,
         1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623, 1623,
         1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1625, 1615, 1615, 1615,
         1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627, 1627,
         1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629, 1629,
         1631, 1631, 1631, 1631, 1631,
          6571, 6571, 6571};

    public static int randomKitchenDrawers() {
        return kitchendrawers[(int) (Math.random() * kitchendrawers.length)];
    }

    public static int Silvchest[] = { 601, 758, 788, 983};

    public static int randomSilvchest() {
        return Silvchest[(int) (Math.random() * Silvchest.length)];
    }

    public static int giantspiderlow[] = { 
           379, 379, 379, 379, 379, 444, 444, 444, 444, 444, 561, 561, 561, 561, 561, 
           379, 379, 379, 379, 379, 444, 444, 444, 444, 444, 561, 561, 561, 561, 561, 746};

    public static int randomGiantSpiderLow() {
        return giantspiderlow[(int) (Math.random() * giantspiderlow.length)];
    }
public static int Barrows[] = {4717, 4719, 4721, 4723, 4709, 4711, 4713, 4715, 4754, 4756, 4758, 4760, 4746, 4748, 4750, 4752, 4733, 4735, 4737, 4739, 4727, 4729, 4731, 4725};
        public static int randomBarrows()
        {
                return Barrows[(int)(Math.random()*Barrows.length)];
        }
    public static int giantspiderhigh[] = { 379, 379, 379, 379, 379, 444, 444, 444, 444, 444, 561, 561, 561, 561, 561, 746};

    public static int randomGiantSpiderHigh() {
        return giantspiderhigh[(int) (Math.random() * giantspiderhigh.length)];
    }

    public static int goblinlow[] = { 
      861, 861, 861, 861, 861, 286, 286, 286, 444, 444, 1077, 1077, 1077, 1089, 1089, 1089,
      1125, 1125, 1125, 1165, 1165, 1165, 975, 975, 1005, 1005, 1005, 1005, 1005, 746};

    public static int randomGoblinLow() {
        return goblinlow[(int) (Math.random() * goblinlow.length)];
    }

    public static int goblinhigh[] = { 288, 288, 288, 1077, 1077, 1077, 1089, 1089, 1089,
      1125, 1125, 1125, 1165, 1165, 1165, 975, 975, 1005, 1005, 1005, 1005, 1005, 746};

    public static int randomGoblinHigh() {
        return goblinhigh[(int) (Math.random() * goblinhigh.length)];
    }

    public static int hobgoblinlow[] = { 
      1025, 1025, 1025, 1025, 1025, 1031, 1031, 1031, 1031, 
      373, 373, 373, 1171, 1422, 1506, 1506, 1757, 1757, 1757};

    public static int randomHobgoblinLow() {
        return hobgoblinlow[(int) (Math.random() * hobgoblinlow.length)];
    }

    public static int hobgoblinhigh[] = {  
       1025, 1025, 1025, 1025, 1025, 1031, 1031, 1031, 1031, 373, 373, 373, 
       1171, 1422, 1506, 1506, 1757, 1757, 1757, 1704, 1704, 1704, 1704};

    public static int randomHobgoblinHigh() {
        return hobgoblinhigh[(int) (Math.random() * hobgoblinhigh.length)];
    }

    public static int poisonspider[] = {  
       1833, 1833, 1833, 1833, 1833, 1835, 1835, 1835, 1835, 1835, 2393, 2393, 2402};

    public static int randomPoisonSpider() {
        return poisonspider[(int) (Math.random() * poisonspider.length)];
    }

    public static int Partyroom[] = { 1038, 1040, 1042, 1044, 1046, 
    1048, 1050, 15334, 15336, 15333, 15335, 4716, 4718, 4720, 4722,
    14507, 14508, 14511, 2633, 2635, 2637, 2978, 2980, 2982, 2984, 2986, 2988, 2990, 2992, 2994,
    2957, 2653, 2655, 2659, 3478, 2665, 2661, 2663, 2667, 3479, 2673, 2669,
    2671, 3480, 4724, 4728, 4730, 4726, 6570, 1037, 1050, 6857, 6859, 6861,
    6863, 6856, 6858, 6860, 6862, 6818, 989};

    public static int randomPartyroom() {
        return Partyroom[(int) (Math.random() * Partyroom.length)];
    }


    public static int feverspider[] = {  
       1833, 1833, 1833, 1833, 1833, 1835, 1835, 1835, 1835, 1835, 2393, 2393, 
       2402, 2402, 2402, 2591, 2593, 2595, 2597};

    public static int randomFeverSpider() {
        return feverspider[(int) (Math.random() * feverspider.length)];
    }

    public static int otherworldlybeing[] = {  
       2645, 2647, 2649, 2890, 581, 581, 581, 581, 581, 581, 581, 581, 1015, 1015, 1015, 
       1015, 1015, 1015, 1015, 1015, 1017, 1017, 1017, 1017, 1017, 1017, 1017, 1017};

    public static int randomOWB() {
        return otherworldlybeing[(int) (Math.random() * otherworldlybeing.length)];
    }

    public static int deathwing[] = {  
       1019, 1019, 1019, 1021, 1021, 1021, 1021, 1021, 1023, 1023, 1023, 1023, 1023,
       1025, 1025, 1025, 1025, 1025, 1027, 1027, 1027, 1027, 1027, 1029, 1029, 1029, 1029, 1029,
       1031, 1031, 1031, 1031, 1031, 6382};

    public static int randomDeathWing() {
        return deathwing[(int) (Math.random() * deathwing.length)];
    }

    public static int phrinshade[] = {  
       546, 548, 6106, 6107, 6108, 6109, 6110, 6111, 581, 581, 581, 581, 581, 581, 581, 581, 1015, 1015, 1015, 
       1015, 1015, 1015, 1015, 1015, 1017, 1017, 1017, 1017, 1017, 1017, 1017, 1017, 581, 581, 581, 581, 581, 
       581, 581, 581, 1015, 1015, 1015, 1015, 1015, 1015, 1015, 1015, 1017, 1017, 1017, 1017, 1017, 1017, 1017, 1017};

    public static int randomPhrinShade() {
        return phrinshade[(int) (Math.random() * phrinshade.length)];
    }

    public static int thrantaxthemighty[] = {  
       546, 548, 6106, 6107, 6108, 6109, 6110, 6111, 581, 581, 581, 581, 581, 581, 581, 581, 1015, 1015, 1015, 
       1015, 1015, 1015, 1015, 1015, 1017, 1017, 1017, 1017, 1017, 1017, 1017, 1017, 1033, 1035, 1033, 1035};

    public static int randomThrantax() {
        return thrantaxthemighty[(int) (Math.random() * thrantaxthemighty.length)];
    }

    public static int nazastarool[] = {  
       4834, 4834, 4834, 4834, 4834, 4834, 4834, 4834, 4834, 4834, 4834, 4834, 4834,
       4834, 4834, 4834, 4834, 4834, 4834, 4834, 4834, 2984, 2985, 2986, 2987, 2988, 
       2989, 2990, 2991, 2992, 2993, 2994, 2995, 2963, 2963};

    public static int randomNazastarool() {
        return nazastarool[(int) (Math.random() * nazastarool.length)];
    }

    public static int rockcrab[] = {  
       4153, 4153, 4153, 3122, 3122, 3122, 14651, 14651, 6809, 6809, 6129, 6129, 6151, 6151,
       6131, 6133, 6135, 4490, 4490, 4490, 4490, 4490, 4490, 4490, 4490, 4490, 4490, 4492, 4492, 
       4492, 4492, 4492, 4492, 4492, 4492, 6157, 6157, 6157, 6157, 6159, 6159, 6159, 1480, 1480};

    public static int randomRockCrab() {
        return rockcrab[(int) (Math.random() * rockcrab.length)];
    }
    public static int wizard[] = {  
      577, 579,	1011, 2579,};

    public static int randomwizard() {
        return wizard[(int) (Math.random() * wizard.length)];
    }

    public static int greaterdemon[] = {  
       592, 592, 592, 592, 592, 592, 592, 528, 528, 528, 528, 528, 528, 528, 528,
       553, 553, 553, 553, 553, 553, 553, 553, 553, 7461, 2402, 1149, 1149, 1187};

    public static int randomGreaterDemon() {
        return greaterdemon[(int) (Math.random() * greaterdemon.length)];
    }

    public static int firewarrioroflesarkus[] = {  
       592, 592, 592, 592, 592, 592, 592, 592, 592, 528, 528, 528, 528, 528, 528, 528, 528,
       553, 553, 553, 553, 553, 553, 553, 553, 553, 4068, 4069, 4070, 4071, 4072};

    public static int randomFWL() {
        return firewarrioroflesarkus[(int) (Math.random() * firewarrioroflesarkus.length)];
    }

    public static int shadowhound[] = {  
       6106, 6107, 6108, 6109, 6110, 6111, 2952, 2959, 2959, 2959, 2959, 2959,
       2959, 2959};

    public static int randomShadowHound() {
        return shadowhound[(int) (Math.random() * shadowhound.length)];
    }

    public static int hellhound[] = {  
       592, 592, 592, 592, 592, 592, 592, 592, 592, 528, 528, 528, 528, 528, 528, 528, 528,
       3053, 5537, 15185 };

    public static int randomHellHound() {
        return hellhound[(int) (Math.random() * hellhound.length)];
    }

    public static int rockgolemlow[] = {  
       1480, 1480, 1480, 1480, 1480, 1480, 1480, 1480, 1480, 
       434, 436, 438, 440, 442, 444, 447, 449, 451, 6040};

    public static int randomRockGolemLow() {
        return rockgolemlow[(int) (Math.random() * rockgolemlow.length)];
    }

    public static int rockgolemhigh[] = {  
       1480, 1480, 1480, 1480, 1480, 1480, 1480, 1480, 1480, 
       434, 436, 438, 440, 442, 444, 447, 449, 451, 6040, 
       1480, 1480, 1480, 1480, 1480, 1480, 1480, 1480, 1480, 
       434, 436, 438, 440, 442, 444, 447, 449, 451, 6040, 6040};

    public static int randomRockGolemHigh() {
        return rockgolemhigh[(int) (Math.random() * rockgolemhigh.length)];
    }

    public static int zombielow[] = {  
       1480, 1480, 1480, 1480, 1480, 1480, 1480, 1480, 1480, 
       526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526,
       4194, 4194, 4194, 4194, 4195, 4195, 4195, 4195, 4196,
       4196, 4196, 4196, 4198, 4198, 4198, 4198, 6040, 6040,
       7592, 7593, 7594, 7595, 7596};

    public static int randomZombieLow() {
        return zombielow[(int) (Math.random() * zombielow.length)];
    }

    public static int zombiehigh[] = {   
       526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526,
       4194, 4194, 4194, 4194, 4195, 4195, 4195, 4195, 4196,
       4196, 4196, 4196, 4198, 4198, 4198, 4198, 6040, 6040,
       7592, 7593, 7594, 7595, 7596};

    public static int randomZombieHigh() {
        return zombiehigh[(int) (Math.random() * zombiehigh.length)];
    }

    public static int shadelow[] = {  
       546, 546, 546, 548, 548, 548, 592, 592, 592, 592, 592, 592, 592, 592, 592,
       592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592,
       6106, 6107, 6108, 6109, 6110, 6111, 6106, 6107, 6108, 6109, 6110, 6111, 1580};

    public static int randomShadeLow() {
        return shadelow[(int) (Math.random() * shadelow.length)];
    }

    public static int shadehigh[] = {  
       546, 546, 546, 548, 548, 548, 592, 592, 592, 592, 592, 592, 592, 592, 592,
       592, 592, 592, 592, 592, 592, 592, 6106, 6107, 6108, 6109, 6110, 6111, 6106, 
       6107, 6108, 6109, 6110, 6111, 1580, 1580};

    public static int randomShadeHigh() {
        return shadehigh[(int) (Math.random() * shadehigh.length)];
    }

    public static int giantmole[] = {  
       1480, 1480, 1480, 1480, 1480, 1480, 1480, 1480, 1480, 15368, 15369, 15370,
       1480, 6585, 6585, 6887, 1480, 1480, 1480, 1480, 1480, 1480, 1480, 1480, 1480,
       1480, 1480, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532};

    public static int randomGiantMole() {
        return giantmole[(int) (Math.random() * giantmole.length)];
    }

    public static int slashbash[] = {  
       13640, 13640, 13640, 4224, 7592, 7593, 7594, 7595, 7596, 
       532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532,
       532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532};

    public static int randomSlashBash() {
        return slashbash[(int) (Math.random() * slashbash.length)];
    }

    public static int jungledemon[] = {  
        
       532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532,
       532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532,
       6040, 6040, 6040, 6040, 5541, 5541, 5541, 561, 561, 561, 561, 561, 561, 561,
       592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 592, 
       4503, 4504, 4505, 4506, 4507};

    public static int randomJungleDemon() {
        return jungledemon[(int) (Math.random() * jungledemon.length)];
    }

    public static int dagprime[] = {  
        
       4566, 4566, 4566, 4566, 4566, 532, 532, 532, 532, 532, 532, 532,
       4567, 4567, 4567, 1724, 532, 532, 532, 532, 532, 532, 532,
       5730, 5730, 5730, 6568, 6568, 6568, 6568, 6735, 6737};

    public static int randomDagPrime() {
        return dagprime[(int) (Math.random() * dagprime.length)];
    }

    public static int fish[] = { 385, 385, 379, 379, 379, 379, 379};

    public static int randomFish() {
        return fish[(int) (Math.random() * fish.length)];
    }	
    public static int rat[] = {
        5698, 1305, 3105, 1725, 1704, 1323, 1153, 1115, 1067, 1081, 1157, 1119,
        1069, 1083};

    public static int randomrat() {
        return rat[(int) (Math.random() * rat.length)];
    }
    public static int rat2[] = {
        5698, 1305, 3105, 1725, 1704, 1323, 1153, 1115, 1067, 1081, 1157, 1119,
        1069, 1083, 1042};

    public static int randomrat2() {
        return rat2[(int) (Math.random() * rat2.length)];
    }
    public static int goblin[] = {
        1203, 1381, 1189, 1139, 1173, 556, 559, 557, 558, 555, 882,
	2307, 1438, 1917, 1009, 1965, 1949, 288, 1987, 438, 1440, 1007,};

    public static int randomgoblin() {
        return goblin[(int) (Math.random() * goblin.length)];
    }
    public static int well[] = {
	15195, 15185, 15348, 14520, 15334, 7449, 15346,};

    public static int randomwell()
    {
    	return well[(int)(Math.random()*well.length)];
    }
public static int chestn[] = {
	1038, 1040, 1042, 1044, 1046, 1048, 1050, 1053, 1055, 1057, 1506, 6335, 6188, 4068, 667, 1307, 1309, 1311, 1313,
	1315, 1317, 1319, 6609, 7158, 74, 1137, 1139, 1141, 1143, 1145,};

    public static int randomchestn()
    {
    	return chestn[(int)(Math.random()*chestn.length)];
    }
public static int box[] = {
	1038, 1040, 1042, 1044, 1046, 1048, 1050, 1053, 1055, 1057,};

    public static int randombox()
    {
    	return box[(int)(Math.random()*box.length)];
    }
    public static int soldier[] = {
        3101, 6897, 3202, 1333, 1319, 1113, 1127, 1147, 1093, 1079, 1373, 4131,
        995};

    public static int randomsoldier() {
        return soldier[(int) (Math.random() * soldier.length)];
    }
    public static int hillg[] = {
	1544, 1545, 1546, 1547, 1548, 995, 995, 995, 995, 995,};

    public static int randomhillg() {
        return hillg[(int) (Math.random() * hillg.length)];
    }
    public static int pirate[] = {
	995, 4273, 995, 4273, 995, 4273, 995,4273, 995, 4273, 995,};

    public static int randompirate() {
        return pirate[(int) (Math.random() * pirate.length)];
    }
    public static int piratechest[] = {
	2651, 2997, 3048, 7110, 7112, 7114, 7116, 7122, 7124, 7126, 7128, 7130, 7132,
	7134, 7134, 7136, 7138,};

    public static int randompiratechest() {
        return piratechest[(int) (Math.random() * piratechest.length)];
    }
    public static int supermummy[] = {
        2412, 2415, 2661, 2663, 2665, 2667, 3479, 4037, 6685, 6762};

    public static int randomsupermummy() {
        return supermummy[(int) (Math.random() * supermummy.length)];
    }
    public static int superbat[] = {
        530, 530, 530, 530, 530, 530, 995, 995, 995, 995, 1040, 995, 995};

    public static int randomsuperbat() {
        return superbat[(int) (Math.random() * superbat.length)];
    }
    public static int chaosdruid[] = {
        995, 257, 227, 1379, 1381, 1383, 1385, 1387};

    public static int randomchaosdruid() {
        return chaosdruid[(int) (Math.random() * chaosdruid.length)];
    }
    public static int blackdragon[] = {
        995, 5698, 4087, 4087, 4087, 5698, 5698, 15185, 3140, 15195, 4585, 4585, 4585, 4585, 4585, 3204, 3204, 4587, 4587, 4587, 4587, 4587, 4587, 4587, 4587, 1305, 1305, 1305, 1305, 1305, 1305, 1305, 1187, 1187, 1187, 1434, 1434, 1434, 1434, 1434, 1377, 1377, 1377, 1377, 1377, 1377, 1377, 15352, 15352, 15352, 15352, 15352, 15352, 7158, 7158, 7158, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 995, 995, 995, 995, 995, 995, 995, 
        995};

    public static int randomblackdragon() {
        return blackdragon[(int) (Math.random() * blackdragon.length)];
    }
    public static int bluedragon[] = {
        995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 5698, 4087, 4087, 4087, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 3140, 15195, 4585, 4585, 4585, 4585, 4585, 3204, 3204, 4587, 4587, 4587, 4587, 4587, 4587, 4587, 4587, 1305, 1305, 1305, 1305, 1305, 1305, 1305, 1187, 1187, 1187, 1434, 1434, 1434, 1434, 1434, 1377, 1377, 1377, 1377, 1377, 1377, 1377, 15352, 15352, 15352, 15352, 15352, 15352, 7158, 7158, 7158, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 995, 995, 995, 995, 995, 995, 995, 
        995, 995, 995, 
        995};

    public static int randombluedragon() {
        return bluedragon[(int) (Math.random() * bluedragon.length)];
    }
    public static int reddragon[] = { 
        995, 995, 995, 995, 995, 995, 995, 995, 5698, 4087, 4087, 4087, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 3140, 15195, 4585, 4585, 4585, 4585, 4585, 3204, 3204, 4587, 4587, 4587, 4587, 4587, 4587, 4587, 4587, 1305, 1305, 1305, 1305, 1305, 1305, 1305, 1187, 1187, 1187, 1434, 1434, 1434, 1434, 1434, 1377, 1377, 1377, 1377, 1377, 1377, 1377, 15352, 15352, 15352, 15352, 15352, 15352, 7158, 7158, 7158, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 995, 995, 995, 995, 995, 995, 995, 
        995};

    public static int randomreddragon() {
        return reddragon[(int) (Math.random() * reddragon.length)];
    }
    public static int greendragon[] = {
        995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 5698, 4087, 4087, 4087, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 3140, 15195, 4585, 4585, 4585, 4585, 4585, 3204, 3204, 4587, 4587, 4587, 4587, 4587, 4587, 4587, 4587, 1305, 1305, 1305, 1305, 1305, 1305, 1305, 1187, 1187, 1187, 1434, 1434, 1434, 1434, 1434, 1377, 1377, 1377, 1377, 1377, 1377, 1377, 15352, 15352, 15352, 15352, 15352, 15352, 7158, 7158, 7158, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 995, 995, 995, 995, 995, 995, 995, 
        995, 995, 995, 
        995};

    public static int randomgreendragon() {
        return greendragon[(int) (Math.random() * greendragon.length)];
    }
    public static int bronzedragon[] = {
        995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 5698, 4087, 4087, 4087, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 3140, 15195, 4585, 4585, 4585, 4585, 4585, 3204, 3204, 4587, 4587, 4587, 4587, 4587, 4587, 4587, 4587, 1305, 1305, 1305, 1305, 1305, 1305, 1305, 1187, 1187, 1187, 1434, 1434, 1434, 1434, 1434, 1377, 1377, 1377, 1377, 1377, 1377, 1377, 15352, 15352, 15352, 15352, 15352, 15352, 7158, 7158, 7158, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 995, 995, 995, 995, 995, 995, 995, 
        995, 995, 995, 
        995};

    public static int randombronzedragon() {
        return bronzedragon[(int) (Math.random() * bronzedragon.length)];
    }
    public static int irondragon[] = {
        995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 5698, 4087, 4087, 4087, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 3140, 15195, 4585, 4585, 4585, 4585, 4585, 3204, 3204, 4587, 4587, 4587, 4587, 4587, 4587, 4587, 4587, 1305, 1305, 1305, 1305, 1305, 1305, 1305, 1187, 1187, 1187, 1434, 1434, 1434, 1434, 1434, 1377, 1377, 1377, 1377, 1377, 1377, 1377, 15352, 15352, 15352, 15352, 15352, 15352, 7158, 7158, 7158, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 995, 995, 995, 995, 995, 995, 995, 
        995, 995, 995, 
        995};

    public static int randomirondragon() {
        return irondragon[(int) (Math.random() * irondragon.length)];
    }
    public static int steeldragon[] = {
        995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 5698, 4087, 4087, 15185, 4087, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 3140, 15195, 4585, 4585, 4585, 4585, 4585, 3204, 3204, 4587, 4587, 4587, 4587, 4587, 4587, 4587, 4587, 1305, 1305, 1305, 1305, 1305, 1305, 1305, 1187, 1187, 1187, 1434, 1434, 1434, 1434, 1434, 1377, 1377, 1377, 1377, 1377, 1377, 1377, 15352, 15352, 15352, 15352, 15352, 15352, 7158, 7158, 7158, 5698, 5698, 5698, 5698, 5698, 5698, 5698, 995, 995, 995, 995, 995, 995, 995, 
        995, 995, 995, 
        995};

    public static int randomsteeldragon() {
        return steeldragon[(int) (Math.random() * steeldragon.length)];
    }

    public static int ogre[] = {
        837, 5018, 995};

    public static int randomogre() {
        return ogre[(int) (Math.random() * ogre.length)];
    }
    public static int chicken[] = { 4834};

    public static int randomchicken() {
        return chicken[(int) (Math.random() * chicken.length)];
    }
    public static int skeleton[] = {
        6137, 6139, 6141, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995,
        995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995,
        995, 995, 995, 995, 995, 995, 995, 995, 995};

    public static int randomskeleton() {
        return skeleton[(int) (Math.random() * skeleton.length)];
    }
    public static int crawlinghand[] = {
        2615, 1333, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526,
        526, 526};

    public static int randomcrawlinghand() {
        return crawlinghand[(int) (Math.random() * crawlinghand.length)];
    }
    public static int cavebug[] = {
        4119, 4121, 4123, 4125, 4127, 4129, 4131, 526, 526, 526, 526, 526, 526,
        526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526};

    public static int randomcavebug() {
        return cavebug[(int) (Math.random() * cavebug.length)];
    }
    public static int jelly[] = {
        14860, 6809, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526,
        526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526,
        526, 526};

    public static int randomjelly() {
        return jelly[(int) (Math.random() * jelly.length)];
    }
    public static int aberrantspecter[] = {
        3840, 3842, 3844, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526,
        526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526,
        526};

    public static int randomaberrantspecter() {
        return aberrantspecter[(int) (Math.random() * aberrantspecter.length)];
    }
    public static int abyssaldemon[] = {
        4151, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526,
        526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526};

    public static int randomabyssaldemon() {
        return abyssaldemon[(int) (Math.random() * abyssaldemon.length)];
    }
    public static int darkbeast[] = {
        6818, 11192, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526,
        526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526,
        526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526,
        526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526,
        526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526,
        526, 526, 526, 526, 526, 526, 526, 526};

    public static int randomdarkbeast() {
        return darkbeast[(int) (Math.random() * darkbeast.length)];
    }
    public static int barbarian[] = {
        1725, 1704, 1038, 3105, 1305, 5698, 4587, 4726, 7386, 7394, 7390, 995};

    public static int randombarbarian() {
        return barbarian[(int) (Math.random() * barbarian.length)];
    }
    public static int unicorn[] = {
        6966, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995,
        995, 995, 995, 995, 995};

    public static int randomunicorn() {
        return unicorn[(int) (Math.random() * unicorn.length)];
    }
    public static int battlemagesara[] = {
        14507, 14508, 14513, 5698, 995, 995, 995, 995, 995, 995, 995, 995, 995,
        995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995,
        995, 995, 995, 995};

    public static int randombattlemagesara() {
        return battlemagesara[(int) (Math.random() * battlemagesara.length)];
    }
    public static int battlemagezammy[] = {
        14507, 14508, 14512, 5698, 995, 995, 995, 995, 995, 995, 995, 995, 995,
        995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995,
        995, 995, 995, 995};

    public static int randombattlemagezammy() {
        return battlemagezammy[(int) (Math.random() * battlemagezammy.length)];
    }
    public static int battlemageguthix[] = {
        14507, 14508, 14511, 5698, 995, 995, 995, 995, 995, 995, 995, 995, 995,
        995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995,
        995, 995, 995, 995};

    public static int randombattlemageguthix() {
        return battlemageguthix[(int) (Math.random() * battlemageguthix.length)];
    }
    public static int troll[] = {
        3741, 3741, 3741, 3741, 995, 995, 995, 995, 995, 995, 995, 995, 995, 995,
        995, 995, 995, 995, 995, 995, 995, 995, 995};

    public static int randomtroll() {
        return troll[(int) (Math.random() * troll.length)];
    }

    public static int KQ[] = {
        2633, 2635, 2637, 2978, 2980, 2982, 2984, 2986, 2988, 2990, 2992, 2994,
        2957, 2653, 2655, 2659, 3478, 2665, 2661, 2663, 2667, 3479, 2673, 2669,
        2671, 3480, 4724, 4728, 4730, 4726, 6570, 1037, 1050, 6857, 6859, 6861,
        6863, 6856, 6858, 6860, 6862, 6818, 989};

    public static int randomKQ() {
        return KQ[(int) (Math.random() * KQ.length)];
    }
    public static int cow[] = {
        526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526, 526,};

    public static int randomcow() {
        return cow[(int) (Math.random() * cow.length)];
    }
    public static int cow2[] = {
        1739, 1739, 1739, 1739, 1739, 1739, 1739, 1739, 1739, 1739, 1739, 1739,};

    public static int randomcow2() {
        return cow2[(int) (Math.random() * cow2.length)];
    }
    public static int cow3[] = {
        2132, 2132, 2132, 2132, 2132, 2132, 2132, 2132, 2132, 2132, 2132, 2132, 2132,};

    public static int randomcow3() {
        return cow3[(int) (Math.random() * cow3.length)];
    }

    public static int Jogre[] = { 4587, 15352, 7158, 1149, 4151, 5698, 1377, 1305, 1434};
    public static int randomJogre() {
        return Jogre[(int) (Math.random() * Jogre.length)];
    }

    public static int Ice_giant[] = { 1543, 1546, 1545, 1548};
    public static int randomIce_giant() {
        return Ice_giant[(int) (Math.random() * Ice_giant.length)];
    }

    public static int Karil[] = {6104};
    public static int randomKaril() {
        return Karil[(int) (Math.random() * Karil.length)];
    }

    public static int Dagannoth_Rex[] = { 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 15348, 15349, 532, 532, 532};
    public static int randomDagannoth_Rex() {
        return Dagannoth_Rex[(int) (Math.random() * Dagannoth_Rex.length)];
    }

    public static int Dagannoth_Prime[] = { 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 15350, 15334, 532, 532, 532};
    public static int randomDagannoth_Prime() {
        return Dagannoth_Prime[(int) (Math.random() * Dagannoth_Prime.length)];
    }

    public static int Dagannoth_Supreme[] = { 4084, 1038, 1040, 1042, 1044, 1046, 1048, 1050, 1053, 747, 686,3};
    public static int randomDagannoth_Supreme() {
        return Dagannoth_Supreme[(int) (Math.random() * Dagannoth_Supreme.length)];
    }

    public static int Flambeed[] = { 6104, 991, 989};
    public static int randomFlambeed() {
        return Flambeed[(int) (Math.random() * Flambeed.length)];
    }

    public static int Black_Demon[] = { 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 14503, 14505, 14504, 532, 532, 532};
    public static int randomBlack_Demon() {
        return Black_Demon[(int) (Math.random() * Black_Demon.length)];
    }

    public static int Skeleton_Hellhound[] = { 532, 532, 532, 532, 532, 532, 532, 532, 532, 532, 14507, 14506, 14508, 14509, 532, 532, 532};
    public static int randomSkeleton_Hellhound() {
        return Skeleton_Hellhound[(int) (Math.random() * Skeleton_Hellhound.length)];
    }

    public static int Agrith_Naar[] = { 532, 532, 532, 532, 532, 532 , 532, 532, 532, 532, 532, 532, 532, 7449, 3140, 532, 532, 532};
    public static int randomAgrith_Naar() {
        return Agrith_Naar[(int) (Math.random() * Agrith_Naar.length)];
    }


    public static int Arzinian_Being_of_Bordanzan[] = { 532, 532, 532, 532, 532, 532 , 532, 532, 532, 532, 532, 532, 15345, 14521, 15346, 532, 532, 532};
    public static int randomArzinian_Being_of_Bordanzan() {
        return Arzinian_Being_of_Bordanzan[(int) (Math.random() * Arzinian_Being_of_Bordanzan.length)];
    }

    public static int KBD[] = { 15352, 15334,4585, 14519, 4087, 15195};
    public static int randomKBD() {
        return KBD[(int) (Math.random() * KBD.length)];
    }

    public static int General_Graardor[] = { 15352, 15334,4585, 14519, 4087, 15195, 15350, 15349, 15348};
    public static int randomGeneral_Graardor() {
        return General_Graardor[(int) (Math.random() * General_Graardor.length)];
    }

    public static int Commander_Zilyana[] = { 15352, 15334,4585, 14519, 4087, 15195, 15347, 15346, 15345};
    public static int randomCommander_Zilyana() {
        return Commander_Zilyana[(int) (Math.random() * Commander_Zilyana.length)];
    }

    public static int Steel_Titan[] = { 15352, 15334,4585, 14519, 4087, 15195};
    public static int randomSteel_Titan() {
        return Steel_Titan[(int) (Math.random() * Steel_Titan.length)];
    }

    public static int Moss_Titan[] = { 15352, 15334,4585, 14519, 4087, 15195};
    public static int randomMoss_Titan() {
        return Moss_Titan[(int) (Math.random() * Moss_Titan.length)];
    }

    public static int Ice_Titan[] = { 15352, 15334,4585, 14519, 4087, 15195};
    public static int randomIce_Titan() {
        return Ice_Titan[(int) (Math.random() * Ice_Titan.length)];
    }
}