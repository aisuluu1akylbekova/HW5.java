public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Fire");


        System.out.println("Boss Health: " + boss.getHealth());
        System.out.println("Boss Damage: " + boss.getDamage());
        System.out.println("Boss Defense Type: " + boss.getDefenseType());


        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero Health: " + hero.getHealth());
            System.out.println("Hero Damage: " + hero.getDamage());
            System.out.println("Hero Superpower: " + hero.getSuperpower());
            System.out.println();
        }
    }

    public static Hero[] createHeroes() {

        Hero hero1 = new Hero(100, 20, "Invisibility");
        Hero hero2 = new Hero(150, 30);
        Hero hero3 = new Hero(200, 40, "Telepathy");


        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}
