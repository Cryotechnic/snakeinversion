import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * GameWorld is where the actual game takes place. It can transition to
 * either the losing, or winning world.
 * @author Lisa, Ron, Dustin
 */
public class GameWorld extends World
{
   private int counter;
   HealthBar healthBar = new HealthBar();
   GreenfootSound gameplaySound;
   /**
    * Constructor for objects of class GameWorld.
    * 
   */
   
   public GameWorld(String color, int length)
   {    
       // Create a new world with 900x700 cells with a cell size of 1x1pixels.
       
       super(900, 700, 1);
       prepare();
       makeSnake(color, length);
   }
    
   public HealthBar getHealthBar()
   {
       return healthBar;
   }
   public void makeSnake(String color, int length){
       
       if(color.equals("Blue")){
           Blue blue = new Blue(length);
           addObject(blue, 190, 463);
        }
        if(color.equals("Green")){
           Green green = new Green(length);
           addObject(green, 190, 463);
        }
        if(color.equals("Red")){
           Red red = new Red(length);
           addObject(red, 190, 463);
        }
   }
   
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        DLCornerWall dLCornerWall = new DLCornerWall();
        addObject(dLCornerWall,63,636);
        DRCornerWall dRCornerWall = new DRCornerWall();
        addObject(dRCornerWall,836,634);
        dRCornerWall.setLocation(896,659);
        ULCornerWall uLCornerWall = new ULCornerWall();
        addObject(uLCornerWall,64,62);
        URCornerWall uRCornerWall = new URCornerWall();
        addObject(uRCornerWall,836,60);
        DWall dWall = new DWall();
        addObject(dWall,182,636);
        DWall dWall2 = new DWall();
        addObject(dWall2,308,634);
        DWall dWall3 = new DWall();
        addObject(dWall3,434,635);
        DWall dWall4 = new DWall();
        addObject(dWall4,542,635);
        DWall dWall5 = new DWall();
        addObject(dWall5,654,637);
        dRCornerWall.setLocation(771,636);
        DWall dWall6 = new DWall();
        addObject(dWall6,771,636);
        UWall uWall = new UWall();
        addObject(uWall,175,63);
        UWall uWall2 = new UWall();
        addObject(uWall2,291,62);
        UWall uWall3 = new UWall();
        addObject(uWall3,396,63);
        UWall uWall4 = new UWall();
        addObject(uWall4,504,64);
        UWall uWall5 = new UWall();
        addObject(uWall5,619,64);
        UWall uWall6 = new UWall();
        addObject(uWall6,728,63);
        dRCornerWall.setLocation(762,658);
        LWall lWall = new LWall();
        addObject(lWall,64,184);
        LWall lWall2 = new LWall();
        addObject(lWall2,63,273);
        LWall lWall3 = new LWall();
        addObject(lWall3,64,389);
        LWall lWall4 = new LWall();
        addObject(lWall4,63,512);
        RWall rWall = new RWall();
        addObject(rWall,835,182);
        RWall rWall2 = new RWall();
        addObject(rWall2,835,294);
        RWall rWall3 = new RWall();
        addObject(rWall3,835,510);
        RWall rWall4 = new RWall();
        addObject(rWall4,836,399);
        dWall6.setLocation(834,636);
        DRCornerWall dRCornerWall2 = new DRCornerWall();
        addObject(dRCornerWall2,834,636);
        dRCornerWall.setLocation(616,299);
        removeObject(dRCornerWall);
        DWall dWall7 = new DWall();
        addObject(dWall7,722,639);
        Lava lava = new Lava();
        addObject(lava,241,222);
        Lava lava2 = new Lava();
        addObject(lava2,687,170);
        Lava lava3 = new Lava();
        addObject(lava3,681,547);
        Lava lava4 = new Lava();
        addObject(lava4,330,421);
        Spikes spikes = new Spikes();
        addObject(spikes,172,544);
        Spikes spikes2 = new Spikes();
        addObject(spikes2,420,127);
        Spikes spikes3 = new Spikes();
        addObject(spikes3,716,390);
        lava.setLocation(176,195);
        spikes2.setLocation(416,232);
        lava4.setLocation(306,382);
        spikes2.setLocation(460,248);
        lava4.setLocation(392,418);
        lava4.setLocation(280,361);
        Spikes spikes4 = new Spikes();
        addObject(spikes4,457,448);
        uWall2.setLocation(331,87);
        Spikes spikes5 = new Spikes();
        addObject(spikes5,331,87);
        rWall2.setLocation(809,276);
        Lava lava5 = new Lava();
        addObject(lava5,809,276);
        dWall2.setLocation(299,608);
        Lava lava6 = new Lava();
        addObject(lava6,299,608);
        lWall2.setLocation(87,327);
        Spikes spikes6 = new Spikes();
        addObject(spikes6,87,327);
        uWall2.setLocation(248,32);
        dWall2.setLocation(324,688);
        dWall2.setLocation(329,669);
        dWall2.setLocation(289,652);
        spikes6.setLocation(126,371);
        spikes6.setLocation(104,387);
        lWall2.setLocation(50,267);
        removeObject(lWall2);
        addObject(lWall2,61,293);
        uWall2.setLocation(256,45);
        removeObject(uWall2);
        UWall uWall7 = new UWall();
        addObject(uWall7,284,63);
        uWall3.setLocation(396,83);
        uWall3.setLocation(398,60);
        UWall uWall8 = new UWall();
        addObject(uWall8,398,60);
        uWall3.setLocation(465,195);
        uWall3.setLocation(372,164);
        uWall4.setLocation(428,36);
        uWall3.setLocation(527,48);
        uWall3.setLocation(578,176);
        removeObject(uWall4);
        uWall3.setLocation(526,145);
        removeObject(uWall3);
        UWall uWall9 = new UWall();
        addObject(uWall9,514,62);
        rWall2.setLocation(664,275);
        removeObject(rWall2);
        addObject(rWall2,836,297);
        dWall2.setLocation(284,680);
        removeObject(dWall2);
        DWall dWall8 = new DWall();
        addObject(dWall8,306,636);
        dWall4.setLocation(563,579);
        lava6.setLocation(324,338);
        lava6.setLocation(523,375);
        dWall8.setLocation(284,671);
        dWall4.setLocation(560,652);
        removeObject(dWall8);
        removeObject(dWall4);
        DWall dWall9 = new DWall();
        addObject(dWall9,306,636);
        DWall dWall10 = new DWall();
        addObject(dWall10,549,637);
        spikes4.setLocation(452,559);
        spikes4.setLocation(448,549);
        Lava lava7 = new Lava();
        addObject(lava7,397,132);
        rWall.setLocation(772,239);
        Spikes spikes7 = new Spikes();
        addObject(spikes7,772,239);
        rWall.setLocation(778,243);
        lava2.setLocation(635,181);
        rWall.setLocation(823,192);
        removeObject(rWall);
        RWall rWall5 = new RWall();
        addObject(rWall5,837,172);
        spikes7.setLocation(758,255);
        spikes4.setLocation(457,565);
        lava7.setLocation(399,116);
        spikes7.setLocation(782,249);
        rWall2.setLocation(779,267);
        rWall2.setLocation(776,257);
        rWall2.setLocation(776,257);
        rWall2.setLocation(743,275);
        removeObject(rWall2);
        removeObject(spikes7);
        lava5.setLocation(697,273);
        addObject(rWall2,836,291);
        lava5.setLocation(681,272);
        lava5.setLocation(752,272);
        dWall6.setLocation(786,588);
        Spikes spikes8 = new Spikes();
        addObject(spikes8,786,588);
        lava3.setLocation(696,541);
        lava3.setLocation(671,513);
        lava3.setLocation(626,479);
        lava6.setLocation(480,391);
        Checkpoint checkpoint = new Checkpoint();
        addObject(checkpoint,596,301);
        Checkpoint checkpoint2 = new Checkpoint();
        addObject(checkpoint2,265,200);
        dWall5.setLocation(712,584);
        Checkpoint checkpoint3 = new Checkpoint();
        addObject(checkpoint3,712,584);
        Checkpoint checkpoint4 = new Checkpoint();
        addObject(checkpoint4,267,464);
        lava2.setLocation(620,186);
        checkpoint4.setLocation(276,466);
        removeObject(checkpoint4);
        removeObject(checkpoint2);
        dWall5.setLocation(698,590);
        removeObject(checkpoint3);
        removeObject(checkpoint);
        dWall5.setLocation(637,605);
        dWall7.setLocation(626,657);
        dWall5.setLocation(675,516);
        removeObject(dWall6);
        dWall5.setLocation(762,655);
        dWall5.setLocation(750,647);
        dWall7.setLocation(576,555);
        dWall5.setLocation(673,652);
        dWall10.setLocation(604,652);
        dWall3.setLocation(494,658);
        dWall9.setLocation(356,662);
        dWall9.setLocation(363,662);
        dWall.setLocation(220,660);
        dWall7.setLocation(540,576);
        dWall3.setLocation(492,592);
        dWall3.setLocation(477,516);
        removeObject(dWall7);
        dWall5.setLocation(750,666);
        dWall10.setLocation(643,648);
        dWall3.setLocation(536,689);
        dWall9.setLocation(365,649);
        dWall.setLocation(208,652);
        DWall dWall11 = new DWall();
        addObject(dWall11,159,634);
        removeObject(dWall);
        dWall3.setLocation(480,685);
        dWall3.setLocation(456,656);
        removeObject(dWall3);
        dWall5.setLocation(668,572);
        removeObject(dWall5);
        dWall10.setLocation(703,664);
        dWall10.setLocation(712,643);
        removeObject(dWall10);
        DWall dWall12 = new DWall();
        addObject(dWall12,281,635);
        dWall9.setLocation(408,648);
        DWall dWall13 = new DWall();
        addObject(dWall13,520,636);
        DWall dWall14 = new DWall();
        addObject(dWall14,644,636);
        DWall dWall15 = new DWall();
        addObject(dWall15,713,633);
        dRCornerWall2.setLocation(800,540);
        dWall15.setLocation(743,619);
        dWall9.setLocation(423,610);
        spikes4.setLocation(427,503);
        rWall3.setLocation(876,642);
        dWall14.setLocation(606,552);
        removeObject(dWall15);
        dWall9.setLocation(376,613);
        removeObject(dWall9);
        dLCornerWall.setLocation(136,660);
        dWall11.setLocation(118,659);
        addObject(dWall9,401,635);
        addObject(dWall15,731,635);
        dRCornerWall2.setLocation(738,422);
        rWall4.setLocation(780,414);
        dRCornerWall2.setLocation(581,407);
        removeObject(dRCornerWall2);
        rWall3.setLocation(860,638);
        rWall3.setLocation(844,523);
        removeObject(rWall3);
        removeObject(dWall14);
        removeObject(dLCornerWall);
        removeObject(dWall11);
        spikes8.setLocation(738,464);
        addObject(dLCornerWall,62,634);
        addObject(dRCornerWall2,843,640);
        dRCornerWall2.setLocation(854,638);
        rWall4.setLocation(813,447);
        removeObject(rWall4);
        RWall rWall6 = new RWall();
        addObject(rWall6,838,415);
        RWall rWall7 = new RWall();
        addObject(rWall7,836,540);
        dRCornerWall2.setLocation(851,633);
        removeObject(dRCornerWall2);
        DRCornerWall dRCornerWall3 = new DRCornerWall();
        addObject(dRCornerWall3,836,641);
        dRCornerWall3.setLocation(836,635);
        DRCornerWall dRCornerWall4 = new DRCornerWall();
        addObject(dRCornerWall4,836,635);
        DWall dWall16 = new DWall();
        addObject(dWall16,636,636);
        DWall dWall17 = new DWall();
        addObject(dWall17,176,635);
        spikes8.setLocation(724,544);
        spikes8.setLocation(722,520);
        removeObject(spikes8);
        dWall15.setLocation(763,576);
        Spikes spikes9 = new Spikes();
        addObject(spikes9,763,576);
        spikes4.setLocation(440,566);
        spikes4.setLocation(436,543);
        removeObject(spikes4);
        dWall15.setLocation(651,597);
        removeObject(dWall15);
        spikes9.setLocation(764,540);
        DWall dWall18 = new DWall();
        addObject(dWall18,732,632);
        dWall18.setLocation(735,656);
        dWall18.setLocation(705,647);
        dWall16.setLocation(668,608);
        dWall18.setLocation(688,578);
        dWall18.setLocation(612,520);
        removeObject(dWall18);
        dWall16.setLocation(649,629);
        removeObject(dWall16);
        DWall dWall19 = new DWall();
        addObject(dWall19,639,631);
        dWall19.setLocation(640,656);
        DWall dWall20 = new DWall();
        addObject(dWall20,756,637);
        dWall19.setLocation(634,670);
        removeObject(dWall19);
        DWall dWall21 = new DWall();
        addObject(dWall21,645,636);
        lava3.setLocation(609,477);
        Spikes spikes10 = new Spikes();
        addObject(spikes10,448,569);
        Checkpoint checkpoint5 = new Checkpoint();
        addObject(checkpoint5,710,191);
        Checkpoint checkpoint6 = new Checkpoint();
        addObject(checkpoint6,364,394);
        checkpoint6.setLocation(196,372);
        uWall.setLocation(216,28);
        HealthBar healthBar = new HealthBar();
        addObject(healthBar,216,28);
        uWall.setLocation(738,25);
        healthBar.setLocation(244,108);
        removeObject(healthBar);
        uRCornerWall.setLocation(272,118);
        removeObject(uWall6);
        uWall.setLocation(768,124);
        uWall.setLocation(748,116);
        removeObject(uWall);
        uWall5.setLocation(656,39);
        addObject(uWall,163,62);
        addObject(uWall6,742,62);
        uWall5.setLocation(592,68);
        removeObject(uWall5);
        URCornerWall uRCornerWall2 = new URCornerWall();
        addObject(uRCornerWall2,841,60);
        UWall uWall10 = new UWall();
        addObject(uWall10,633,62);
        removeObject(uWall9);
        addObject(uWall9,514,62);
        uRCornerWall.setLocation(396,273);
        removeObject(uRCornerWall);
        uWall6.setLocation(746,72);
        HealthBar healthBar2 = new HealthBar();
        addObject(healthBar2,746,72);
        uWall6.setLocation(712,48);
        removeObject(uWall10);
        uWall6.setLocation(536,219);
        removeObject(uWall6);
        UWall uWall11 = new UWall();
        addObject(uWall11,635,63);
        UWall uWall12 = new UWall();
        addObject(uWall12,749,62);
        healthBar2.setLocation(628,88);
        healthBar2.setLocation(621,289);
        uWall11.setLocation(773,34);
        healthBar2.setLocation(197,21);
        uWall11.setLocation(550,98);
        uWall11.setLocation(662,117);
        removeObject(uWall11);
        removeObject(uWall12);
        UWall uWall13 = new UWall();
        addObject(uWall13,636,62);
        UWall uWall14 = new UWall();
        addObject(uWall14,752,62);
        removeObject(healthBar2);
        checkpoint6.setLocation(199,371);
        checkpoint6.setLocation(272,423);
        removeObject(checkpoint6);
        checkpoint5.setLocation(679,237);
        removeObject(checkpoint5);
    }
}
