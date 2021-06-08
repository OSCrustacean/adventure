import java.util.Random;

class Enemy {
  private int maxHealth = 75;
  private int maxDamage = 25;
  private String[] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
  private String name;
  private int health;

  Random rand = new Random();
  
  public Enemy() {
    health = rand.nextInt(maxHealth) + 26;
    name = enemies[rand.nextInt(enemies.length)];
  }

  public int returnHealth() {
    return health;
  }
  public String returnName() {
    return name;
  }

  public int enemyDamage() {
    return rand.nextInt(maxDamage);
  }
  public void takeDamage(int d) {
    health -= d;
  }
}