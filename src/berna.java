//import java.util.Random;

import java.util.Scanner;

abstract class Character
{
    void setHP() {}
    void setName(){}
    void setDMG(){}
    void setLVL(){}
}


class _Player extends Character
{

    private int hp = 100;
    private String name = " ";
    private int level = 1;
    private int exp = 0;
    private int damage = 25;

    public int getEXP(){return exp;}
    public int setEXP(int x){ this.exp = this.exp + x;}

    public void changeEXP(int x)
    {
        int temp = getEXP();
        temp = temp + x;

        if(x > 100){setEXP();}

    }
}
    public _Player(String name)
    {

        this.name = name;
        // sen hep salatalık ye artık

    }
//DUZ LA YA RAK Yİ

    public void setHP(int x){this.hp = x; //HOŞSUN DA}
    public int getHP(){return this.hp;}
    public void HP(int x){ this.hp = this.hp - x;}   //LEFT 4 DEAD

// HOŞSUN DA ONDAN dicektim güldün ya ne den bu ka dar gü lü yor sun di ye so ra cak lar diye dedin ya
    //??   I GROOVE

    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}

    //burası artan bir fonksiyon
    void setLVL(){this.level = this.level + 1;}

    void setDMG(int x)
    {
        this.damage = x;
    }

}


class _Enemy extends Character
{
    private String nameArr[] = {"Anaconda", "Panda", "Korona", "Hentai", "KUKUMOUNTH", "AIDS"};
    private String name = " "; //LIKIR LIKIR
    private int hp = 0;

    //sad
    private int damage = 0;
    private int level = 0;

    public _Enemy(int hp, int level, int damage)
    {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.damage = damage;

        /*
            _Enemy.findName() name[rand] = this.name;
        */

        /*
            STAY HOME IF YOU SICC
            COME OVER IF YOU THICC
        */

        void findName(int rand_int1 = java.util.Random.nextInt(5))
        {
            this.name = nameArr[rand_int1];
        }
    }
}

 class test
 {
    public static void main(String[] args)
    {
        String tempName = "";
        System.out.println("OYUNA GELİNİZ\n ADINIZI SÖYLEYİNİZ ");

        Scanner sc = new Scanner(System.in);
        tempName = sc.nextLine();
        sc.close();



        // java da new nasıl yazılıyordu aq
        _Player player = new _Player (tempName);// Bİ SN İŞİCEM

        player.setLVL();

    }
}


/*
   int x = (rand %50) + 1
 */


/*
 berna 80kg

 */







/*
    EnemyLevel *




                                 _,..----.._
                               _/  . -.     \_
                              /     \  \      \_
                             /    _  \ _`-.  -. \
                            /  _-'_.  /    \   \ \
                           /  /  /     \-_  \_ /  .
                          /  /  /     / \_\_  '   `.
                         (   `._'    /    \ \_     |
                          \         /      ; |    -.
                          /  /     /       \ |._   |
                         (  / ._.-'         )/ |  ||
                          \`|  ---.  .---. //  ' .'|
                          . \  `-' )  `''  '  /  ' |
                         /  | (   /          // /  '
                         `. |\ \  ._.       // /  /____
                           \|| |\ ____     // '/  /    `-
                            '| \ \`..'  / / .-'  /       \
                             | |  \_  _/ / '( ) |         \
                ___..__      | /    `'  /  `./  \          \
             _-'       `-.   |      /   \   /  / \          .
           _/             `- |  // /   .-  /  /   \         `
          /   _.-           `'.   .-' /     _// /| \_
         /   /        _    )   `./    \ .--'-' / /\_ \       \
        /   /      .-' `-./      |     `-'__.-' /  \\|
       /    |   -\ |      - ._   \  _          '    /'
       |    /  / | |       \  )   -' .-.            \         :
       |   / . | | |   .--.|  /  /  /o |             \        `
       |  / /  | : |   .--.| .  /   \_/               \        \
       / / (   | \ |  `._O'| ! .                       \        .
      // .  `  |  \ \      |.' |                       .        |
      /|  -._  |   \|   )  |   `              /       . \       `
       |     \ |           '  ) \            /        '  .       .
     _/     -._ \  .----. /  /   \._     _.-'        .   \       \
  .-'_-'-,     \ \  `--' /  (     . `---'            '    \       \
 |.-'  _/       \ \     / .-.\  \\ \                /     \        \
 \\   /          ) )-._.'/    `.  \|               |       \  _     )
  \|  /|     _.-'//     /       `-.|               |        -'      |
      |\ \  /    / _.-'/           -.              |        |       |
      |   `-.    \'  .'              \             \        '       '
      \\    `.   |  /                 `.            \      .        '
      /      -  _/                      `.           `.    |        '
      \   _.'  /                          -.          |    |       ,
     / -.     /           _.-               `.        |    |       '
    /    -   _.              `\               -.      `.   |      /
    \ -.   .'                  `._              \      |   !     ,
     |  ._/                       -.             `. .-=\  .'
     |   /._            |           `.             \-'  |.'     /
     |  /,o ;                        |-            _`.--'       ;
     \ .|`.'            |            | `-_      _.'_.          /
     -' |               '            |    `.   (_ .           /
    /   \              /             |      `-_ _' _         /`.
   /     \           .'              |      /(_' _'         .' !
  .       `._     _.'                |     / ( -'_.-'     _.'  |
  (       |  `---'                    \-._'   (._ _.- _.-'      .
  `.      |  \                         \ :F_P:|: `---'  |       !
    \     |   \                         \     ||        |        .
     `.__.|    \                         \`-._/`.       |        !
          |                               \   \ |       |         .
           \                               \_  \|       |         |
            \                            .-' `. `.      |         `



*/


