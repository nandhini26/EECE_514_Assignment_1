import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        try {
            int int5 = 0; // flaky: animatedSprite4.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Player player9 = null;
        try {
// flaky:             level8.registerPlayer(player9);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        try {
            int int7 = 0; // flaky: animatedSprite4.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        try {
            int int6 = 0; // flaky: animatedSprite4.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.level.Player player11 = null;
        try {
// flaky:             level8.registerPlayer(player11);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite1 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray2 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite1 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite5 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray2, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass6 = animatedSprite5.getClass();
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite5, 10, 0, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        try {
            java.util.Map<nl.tudelft.jpacman.board.Direction, nl.tudelft.jpacman.sprite.Sprite> directionMap1 = pacManSprites0.getPacmanSprites();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/pacman.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite1 = pacManSprites0.getGroundSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/floor.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        try {
            int int6 = 0; // flaky: animatedSprite4.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.npc.ghost.GhostColor ghostColor1 = null;
        try {
            java.util.Map<nl.tudelft.jpacman.board.Direction, nl.tudelft.jpacman.sprite.Sprite> directionMap2 = null; // flaky: pacManSprites0.getGhostSprite(ghostColor1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite3 = pacManSprites0.getGroundSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/floor.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.level.Player player14 = null;
        try {
// flaky:             level8.registerPlayer(player14);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.restart();
        java.awt.Graphics graphics8 = null;
        try {
// flaky:             animatedSprite4.draw(graphics8, (int) (short) 10, (int) 'a', (int) (byte) 10, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("hi!");
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: hi!");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite3 = pacManSprites0.getPelletSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/pellet.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.npc.ghost.GhostColor ghostColor3 = null;
        try {
            java.util.Map<nl.tudelft.jpacman.board.Direction, nl.tudelft.jpacman.sprite.Sprite> directionMap4 = null; // flaky: pacManSprites0.getGhostSprite(ghostColor3);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.setAnimating(false);
        java.awt.Graphics graphics9 = null;
        try {
// flaky:             animatedSprite4.draw(graphics9, 100, 100, (int) (short) 100, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        try {
            int int9 = 0; // flaky: animatedSprite8.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver10 = null;
// flaky:         level8.removeObserver(levelObserver10);
        try {
            int int12 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.restart();
        java.awt.Graphics graphics9 = null;
        try {
// flaky:             animatedSprite4.draw(graphics9, (int) (byte) 100, 1, (int) '4', 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        boolean boolean11 = false; // flaky: level8.isInProgress();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite5 = pacManSprites0.getGroundSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/floor.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.setAnimating(false);
        try {
            int int9 = 0; // flaky: animatedSprite4.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        java.lang.Class<?> wildcardClass11 = null; // flaky: level8.getClass();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Player player15 = null;
        try {
// flaky:             level8.registerPlayer(player15);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.restart();
        try {
            int int9 = 0; // flaky: animatedSprite4.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        boolean boolean11 = false; // flaky: level8.isInProgress();
        boolean boolean12 = false; // flaky: level8.isInProgress();
        try {
            int int13 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        try {
            int int14 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite5 = pacManSprites0.getWallSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/wall.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        nl.tudelft.jpacman.board.Board board0 = null;
        java.util.List<nl.tudelft.jpacman.npc.Ghost> ghostList1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray3 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList4 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList4, ghostArray3);
        nl.tudelft.jpacman.board.Square[] squareArray6 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList7 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList7, squareArray6);
        nl.tudelft.jpacman.level.CollisionMap collisionMap9 = null;
        nl.tudelft.jpacman.level.Level level10 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList7, collisionMap9);
        nl.tudelft.jpacman.level.CollisionMap collisionMap11 = null;
        try {
            nl.tudelft.jpacman.level.Level level12 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, ghostList1, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList7, collisionMap11);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(squareArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        try {
            int int5 = 0; // flaky: animatedSprite4.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite1 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray2 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite1 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite5 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray2, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass6 = animatedSprite5.getClass();
        animatedSprite5.setAnimating(true);
        animatedSprite5.restart();
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite5, (int) (byte) 0, 0, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite3 = pacManSprites0.getWallSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/wall.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver11 = null;
// flaky:         level8.removeObserver(levelObserver11);
        nl.tudelft.jpacman.level.Player player13 = null;
        try {
// flaky:             level8.registerPlayer(player13);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite1 = pacManSprites0.getPacManDeathAnimation();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/dead.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        try {
            java.util.Map<nl.tudelft.jpacman.board.Direction, nl.tudelft.jpacman.sprite.Sprite> directionMap3 = pacManSprites0.getPacmanSprites();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/pacman.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite3 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray4 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite3 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray4, (int) (byte) 10, true);
        animatedSprite7.setAnimating(false);
        animatedSprite7.setAnimating(false);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite7, 1, 1, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(spriteArray4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.restart();
        java.lang.Class<?> wildcardClass8 = animatedSprite4.getClass();
        java.awt.Graphics graphics9 = null;
        try {
// flaky:             animatedSprite4.draw(graphics9, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray2 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList3 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList3, ghostArray2);
        nl.tudelft.jpacman.board.Square[] squareArray5 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList6 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList6, squareArray5);
        nl.tudelft.jpacman.level.CollisionMap collisionMap8 = null;
        nl.tudelft.jpacman.level.Level level9 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList6, collisionMap8);
        nl.tudelft.jpacman.board.Square[] squareArray10 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList11 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList11, squareArray10);
        nl.tudelft.jpacman.level.CollisionMap collisionMap13 = null;
        nl.tudelft.jpacman.level.Level level14 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList11, collisionMap13);
        try {
            level14.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(squareArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.npc.ghost.GhostColor ghostColor5 = null;
        try {
            java.util.Map<nl.tudelft.jpacman.board.Direction, nl.tudelft.jpacman.sprite.Sprite> directionMap6 = null; // flaky: pacManSprites0.getGhostSprite(ghostColor5);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite5 = pacManSprites0.getPacManDeathAnimation();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/dead.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.setAnimating(false);
        java.awt.Graphics graphics10 = null;
        try {
// flaky:             animatedSprite4.draw(graphics10, (int) (short) 10, (int) (byte) -1, (int) (byte) -1, (int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite12 = null; // flaky: animatedSprite4.split(100, (int) (byte) -1, (int) (short) 100, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite1 = pacManSprites0.getPelletSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/pellet.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite1 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray2 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite1 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite5 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray2, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray2, 0, true);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite8, (int) 'a', (int) (short) 10, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver11 = null;
// flaky:         level8.removeObserver(levelObserver11);
// flaky:         level8.stop();
        try {
            int int14 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        java.awt.Graphics graphics8 = null;
        try {
// flaky:             animatedSprite7.draw(graphics8, (int) (byte) 1, (int) (short) -1, (int) (short) 100, (int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        try {
            int int8 = 0; // flaky: animatedSprite7.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Player player11 = null;
        try {
// flaky:             level8.registerPlayer(player11);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.restart();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite10 = null; // flaky: animatedSprite4.split(10, (int) (short) 100, 100, (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level8.move(unit15, direction16);
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        java.lang.Class<?> wildcardClass11 = animatedSprite10.getClass();
        try {
            int int12 = 0; // flaky: animatedSprite10.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        java.awt.Graphics graphics11 = null;
        try {
// flaky:             animatedSprite10.draw(graphics11, (int) '#', (int) '#', (int) '4', (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        java.awt.Graphics graphics8 = null;
        try {
// flaky:             animatedSprite4.draw(graphics8, (int) (byte) 10, 0, (int) '4', (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        try {
            int int17 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        java.lang.Class<?> wildcardClass14 = null; // flaky: level8.getClass();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.addObserver(levelObserver15);
        try {
            int int17 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
// flaky:         level8.stop();
        boolean boolean16 = false; // flaky: level8.isAnyPlayerAlive();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = pacManSprites0.getPacManDeathAnimation();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/dead.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        boolean boolean11 = false; // flaky: level8.isInProgress();
        boolean boolean12 = false; // flaky: level8.isInProgress();
        java.lang.Class<?> wildcardClass13 = null; // flaky: level8.getClass();
        nl.tudelft.jpacman.level.Player player14 = null;
        try {
// flaky:             level8.registerPlayer(player14);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite5 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray6 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite5 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite9 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray6, (int) (byte) 10, true);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite9, (int) (short) 1, 10, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(spriteArray6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite3 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray4 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite3 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray4, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray4, (int) ' ', false, false);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite11, (int) (short) -1, (int) (short) 10, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(spriteArray4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("hi!");
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: hi!");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
        boolean boolean14 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level8.move(unit15, direction16);
        nl.tudelft.jpacman.level.Player player18 = null;
        try {
// flaky:             level8.registerPlayer(player18);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.setAnimating(false);
        try {
            int int10 = 0; // flaky: animatedSprite4.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.awt.Graphics graphics5 = null;
        try {
// flaky:             animatedSprite4.draw(graphics5, 10, 10, (int) ' ', (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
        boolean boolean14 = false; // flaky: level8.isAnyPlayerAlive();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Player player10 = null;
        try {
// flaky:             level8.registerPlayer(player10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '#', false, false);
        java.awt.Graphics graphics13 = null;
        try {
// flaky:             animatedSprite12.draw(graphics13, (int) (short) -1, (int) (short) 100, (int) (short) 0, (int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.restart();
        animatedSprite4.setAnimating(true);
        try {
            int int11 = 0; // flaky: animatedSprite4.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        java.awt.Graphics graphics8 = null;
        try {
// flaky:             animatedSprite7.draw(graphics8, (int) (short) 10, 100, 0, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit10 = null;
        nl.tudelft.jpacman.board.Direction direction11 = null;
// flaky:         level8.move(unit10, direction11);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        try {
            java.util.Map<nl.tudelft.jpacman.board.Direction, nl.tudelft.jpacman.sprite.Sprite> directionMap7 = pacManSprites0.getPacmanSprites();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/pacman.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, false);
        java.awt.Graphics graphics12 = null;
        try {
// flaky:             animatedSprite11.draw(graphics12, (-1), (int) (byte) 0, 1, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite5 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray6 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite5 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite9 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray6, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray6, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray6, 100, false);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite19 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite15, (-1), (int) (short) 0, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(spriteArray6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite7 = pacManSprites0.getWallSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/wall.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver10 = null;
// flaky:         level8.addObserver(levelObserver10);
        boolean boolean12 = false; // flaky: level8.isAnyPlayerAlive();
        boolean boolean13 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.level.Player player14 = null;
        try {
// flaky:             level8.registerPlayer(player14);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass7 = pacManSprites0.getClass();
        nl.tudelft.jpacman.npc.ghost.GhostColor ghostColor8 = null;
        try {
            java.util.Map<nl.tudelft.jpacman.board.Direction, nl.tudelft.jpacman.sprite.Sprite> directionMap9 = null; // flaky: pacManSprites0.getGhostSprite(ghostColor8);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        java.awt.Graphics graphics12 = null;
        try {
// flaky:             animatedSprite11.draw(graphics12, (int) '4', (int) 'a', 1, (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("hi!");
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: hi!");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
        boolean boolean14 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level8.move(unit15, direction16);
        try {
            int int18 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass7 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite8 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray9 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite8 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite18 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, 100, false);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite22 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite18, (int) (short) 1, (int) '#', false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(spriteArray9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver11 = null;
// flaky:         level8.removeObserver(levelObserver11);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver13 = null;
// flaky:         level8.removeObserver(levelObserver13);
        nl.tudelft.jpacman.level.Player player15 = null;
        try {
// flaky:             level8.registerPlayer(player15);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite5 = pacManSprites0.getPelletSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/pellet.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.setAnimating(true);
        animatedSprite4.restart();
        java.awt.Graphics graphics10 = null;
        try {
// flaky:             animatedSprite4.draw(graphics10, (int) '#', 1, 0, 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.restart();
        try {
            int int11 = 0; // flaky: animatedSprite4.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver10 = null;
// flaky:         level8.addObserver(levelObserver10);
        boolean boolean12 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit13 = null;
        nl.tudelft.jpacman.board.Direction direction14 = null;
// flaky:         level8.move(unit13, direction14);
        nl.tudelft.jpacman.level.Player player16 = null;
        try {
// flaky:             level8.registerPlayer(player16);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.restart();
        animatedSprite4.setAnimating(true);
        animatedSprite4.restart();
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass7 = pacManSprites0.getClass();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.getPelletSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/pellet.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.restart();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite10 = null; // flaky: animatedSprite4.split((int) (byte) 1, (int) '#', 10, (int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board11 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit12 = null;
        nl.tudelft.jpacman.board.Direction direction13 = null;
// flaky:         level8.move(unit12, direction13);
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.restart();
        java.lang.Class<?> wildcardClass8 = animatedSprite4.getClass();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite13 = null; // flaky: animatedSprite4.split(0, 1, (-1), (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        java.lang.Class<?> wildcardClass11 = animatedSprite10.getClass();
        try {
            int int12 = 0; // flaky: animatedSprite10.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver10 = null;
// flaky:         level8.addObserver(levelObserver10);
        boolean boolean12 = false; // flaky: level8.isAnyPlayerAlive();
        boolean boolean13 = false; // flaky: level8.isInProgress();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board12 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit13 = null;
        nl.tudelft.jpacman.board.Direction direction14 = null;
// flaky:         level8.move(unit13, direction14);
        try {
            int int16 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(board12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level8.move(unit15, direction16);
        try {
            int int18 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass7 = pacManSprites0.getClass();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.getGroundSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/floor.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("hi!");
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: hi!");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver11 = null;
// flaky:         level8.removeObserver(levelObserver11);
        try {
            int int13 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.npc.ghost.GhostColor ghostColor7 = null;
        try {
            java.util.Map<nl.tudelft.jpacman.board.Direction, nl.tudelft.jpacman.sprite.Sprite> directionMap8 = null; // flaky: pacManSprites0.getGhostSprite(ghostColor7);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        boolean boolean17 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit18 = null;
        nl.tudelft.jpacman.board.Direction direction19 = null;
// flaky:         level8.move(unit18, direction19);
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray3 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList4 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList4, ghostArray3);
        nl.tudelft.jpacman.board.Square[] squareArray6 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList7 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList7, squareArray6);
        nl.tudelft.jpacman.level.CollisionMap collisionMap9 = null;
        nl.tudelft.jpacman.level.Level level10 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList7, collisionMap9);
        nl.tudelft.jpacman.board.Square[] squareArray11 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList12 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList12, squareArray11);
        nl.tudelft.jpacman.level.CollisionMap collisionMap14 = null;
        nl.tudelft.jpacman.level.Level level15 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList12, collisionMap14);
        nl.tudelft.jpacman.board.Board board16 = null;
        nl.tudelft.jpacman.board.Board board17 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray18 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList19 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList19, ghostArray18);
        nl.tudelft.jpacman.board.Square[] squareArray21 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList22 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList22, squareArray21);
        nl.tudelft.jpacman.level.CollisionMap collisionMap24 = null;
        nl.tudelft.jpacman.level.Level level25 = null; // flaky: new nl.tudelft.jpacman.level.Level(board17, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList22, collisionMap24);
        nl.tudelft.jpacman.board.Square[] squareArray26 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList27 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList27, squareArray26);
        nl.tudelft.jpacman.level.CollisionMap collisionMap29 = null;
        nl.tudelft.jpacman.level.Level level30 = null; // flaky: new nl.tudelft.jpacman.level.Level(board16, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap29);
        nl.tudelft.jpacman.level.CollisionMap collisionMap31 = null;
        nl.tudelft.jpacman.level.Level level32 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap31);
        boolean boolean33 = false; // flaky: level32.isAnyPlayerAlive();
        org.junit.Assert.assertNotNull(ghostArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(squareArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ghostArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(squareArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(squareArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        boolean boolean17 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit18 = null;
        nl.tudelft.jpacman.board.Direction direction19 = null;
// flaky:         level8.move(unit18, direction19);
// flaky:         level8.stop();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        java.lang.Class<?> wildcardClass8 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.setAnimating(false);
        try {
            int int13 = 0; // flaky: animatedSprite4.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass7 = pacManSprites0.getClass();
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = pacManSprites0.getPacManDeathAnimation();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/dead.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
// flaky:         level8.stop();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass7 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite8 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray9 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite8 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite24 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) (byte) -1, false);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite31 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite27, (int) (byte) 100, (int) (byte) 0, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(spriteArray9);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.restart();
        try {
            int int8 = 0; // flaky: animatedSprite4.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        try {
            int int8 = 0; // flaky: animatedSprite7.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        boolean boolean15 = false; // flaky: level8.isAnyPlayerAlive();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.restart();
        java.lang.Class<?> wildcardClass8 = animatedSprite4.getClass();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite13 = null; // flaky: animatedSprite4.split(100, (-1), (int) (short) 10, (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        try {
            int int12 = 0; // flaky: animatedSprite11.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        boolean boolean14 = false; // flaky: level8.isInProgress();
// flaky:         level8.stop();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true, false);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite17 = null; // flaky: animatedSprite12.split((-1), 0, (int) (short) 100, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        boolean boolean17 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver18 = null;
// flaky:         level8.addObserver(levelObserver18);
        try {
            int int20 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.setAnimating(true);
        try {
            int int9 = 0; // flaky: animatedSprite4.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (-1), false, false);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        java.awt.Graphics graphics9 = null;
        try {
// flaky:             animatedSprite8.draw(graphics9, (int) ' ', 10, (int) (short) 10, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite9 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray10 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite9 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray10, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass14 = animatedSprite13.getClass();
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite18 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite13, 10, (int) (byte) 0, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(spriteArray10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        boolean boolean11 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        try {
            java.util.Map<nl.tudelft.jpacman.board.Direction, nl.tudelft.jpacman.sprite.Sprite> directionMap5 = pacManSprites0.getPacmanSprites();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/pacman.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = null;
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite1 = pacManSprites0.getWallSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/wall.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray2 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList3 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList3, ghostArray2);
        nl.tudelft.jpacman.board.Square[] squareArray5 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList6 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList6, squareArray5);
        nl.tudelft.jpacman.level.CollisionMap collisionMap8 = null;
        nl.tudelft.jpacman.level.Level level9 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList6, collisionMap8);
        nl.tudelft.jpacman.board.Square[] squareArray10 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList11 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList11, squareArray10);
        nl.tudelft.jpacman.level.CollisionMap collisionMap13 = null;
        nl.tudelft.jpacman.level.Level level14 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList11, collisionMap13);
        nl.tudelft.jpacman.board.Board board15 = null; // flaky: level14.getBoard();
        nl.tudelft.jpacman.level.Player player16 = null;
        try {
// flaky:             level14.registerPlayer(player16);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(squareArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(board15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Board board4 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray5 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList6 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList6, ghostArray5);
        nl.tudelft.jpacman.board.Square[] squareArray8 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList9 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList9, squareArray8);
        nl.tudelft.jpacman.level.CollisionMap collisionMap11 = null;
        nl.tudelft.jpacman.level.Level level12 = null; // flaky: new nl.tudelft.jpacman.level.Level(board4, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList6, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList9, collisionMap11);
        nl.tudelft.jpacman.level.CollisionMap collisionMap13 = null;
        nl.tudelft.jpacman.level.Level level14 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList9, collisionMap13);
        boolean boolean15 = false; // flaky: level14.isAnyPlayerAlive();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(squareArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite14 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 1, true);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        animatedSprite7.setAnimating(false);
        animatedSprite7.setAnimating(false);
        try {
            int int12 = 0; // flaky: animatedSprite7.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '4', false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 1, true, true);
        animatedSprite17.setAnimating(false);
        java.awt.Graphics graphics20 = null;
        try {
// flaky:             animatedSprite17.draw(graphics20, (int) (short) -1, (int) '4', (int) '#', (int) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '4', false);
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray14 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite13 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite18 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (short) 0, false, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite21 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (short) 100, false);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite26 = null; // flaky: animatedSprite21.split((int) (short) 0, (int) (short) 10, (int) (short) 100, (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray14);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver10 = null;
// flaky:         level8.addObserver(levelObserver10);
// flaky:         level8.stop();
        boolean boolean13 = false; // flaky: level8.isAnyPlayerAlive();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray3 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList4 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList4, ghostArray3);
        nl.tudelft.jpacman.board.Square[] squareArray6 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList7 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList7, squareArray6);
        nl.tudelft.jpacman.level.CollisionMap collisionMap9 = null;
        nl.tudelft.jpacman.level.Level level10 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList7, collisionMap9);
        nl.tudelft.jpacman.board.Square[] squareArray11 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList12 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList12, squareArray11);
        nl.tudelft.jpacman.level.CollisionMap collisionMap14 = null;
        nl.tudelft.jpacman.level.Level level15 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList12, collisionMap14);
        nl.tudelft.jpacman.board.Board board16 = null;
        nl.tudelft.jpacman.board.Board board17 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray18 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList19 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList19, ghostArray18);
        nl.tudelft.jpacman.board.Square[] squareArray21 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList22 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList22, squareArray21);
        nl.tudelft.jpacman.level.CollisionMap collisionMap24 = null;
        nl.tudelft.jpacman.level.Level level25 = null; // flaky: new nl.tudelft.jpacman.level.Level(board17, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList22, collisionMap24);
        nl.tudelft.jpacman.board.Square[] squareArray26 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList27 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList27, squareArray26);
        nl.tudelft.jpacman.level.CollisionMap collisionMap29 = null;
        nl.tudelft.jpacman.level.Level level30 = null; // flaky: new nl.tudelft.jpacman.level.Level(board16, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap29);
        nl.tudelft.jpacman.level.CollisionMap collisionMap31 = null;
        nl.tudelft.jpacman.level.Level level32 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap31);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver33 = null;
// flaky:         level32.addObserver(levelObserver33);
// flaky:         level32.stop();
        org.junit.Assert.assertNotNull(ghostArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(squareArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ghostArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(squareArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(squareArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite7 = pacManSprites0.getGroundSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/floor.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.board.Unit unit17 = null;
        nl.tudelft.jpacman.board.Direction direction18 = null;
// flaky:         level8.move(unit17, direction18);
// flaky:         level8.stop();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite7 = pacManSprites0.getPelletSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/pellet.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite14 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', true);
        try {
            int int15 = 0; // flaky: animatedSprite14.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        java.lang.Class<?> wildcardClass11 = null; // flaky: level8.getClass();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
// flaky:         level8.stop();
        try {
            int int15 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.level.Player player14 = null;
        try {
// flaky:             level8.registerPlayer(player14);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray3 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList4 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList4, ghostArray3);
        nl.tudelft.jpacman.board.Square[] squareArray6 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList7 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList7, squareArray6);
        nl.tudelft.jpacman.level.CollisionMap collisionMap9 = null;
        nl.tudelft.jpacman.level.Level level10 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList7, collisionMap9);
        nl.tudelft.jpacman.board.Square[] squareArray11 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList12 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList12, squareArray11);
        nl.tudelft.jpacman.level.CollisionMap collisionMap14 = null;
        nl.tudelft.jpacman.level.Level level15 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList12, collisionMap14);
        java.util.List<nl.tudelft.jpacman.board.Square> squareList16 = null;
        nl.tudelft.jpacman.level.CollisionMap collisionMap17 = null;
        nl.tudelft.jpacman.level.Level level18 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, squareList16, collisionMap17);
        nl.tudelft.jpacman.level.Player player19 = null;
        try {
            level18.registerPlayer(player19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(squareArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.board.Board board17 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver18 = null;
// flaky:         level8.addObserver(levelObserver18);
        nl.tudelft.jpacman.board.Unit unit20 = null;
        nl.tudelft.jpacman.board.Direction direction21 = null;
// flaky:         level8.move(unit20, direction21);
        try {
            int int23 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board17);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        nl.tudelft.jpacman.board.Board board0 = null;
        java.util.List<nl.tudelft.jpacman.npc.Ghost> ghostList1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray3 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList4 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList4, ghostArray3);
        nl.tudelft.jpacman.board.Board board6 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray7 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList8 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList8, ghostArray7);
        nl.tudelft.jpacman.board.Board board10 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray11 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList12 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList12, ghostArray11);
        nl.tudelft.jpacman.board.Square[] squareArray14 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList15 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList15, squareArray14);
        nl.tudelft.jpacman.level.CollisionMap collisionMap17 = null;
        nl.tudelft.jpacman.level.Level level18 = null; // flaky: new nl.tudelft.jpacman.level.Level(board10, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList12, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList15, collisionMap17);
        nl.tudelft.jpacman.level.CollisionMap collisionMap19 = null;
        nl.tudelft.jpacman.level.Level level20 = null; // flaky: new nl.tudelft.jpacman.level.Level(board6, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList8, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList15, collisionMap19);
        nl.tudelft.jpacman.level.CollisionMap collisionMap21 = null;
        nl.tudelft.jpacman.level.Level level22 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList15, collisionMap21);
        nl.tudelft.jpacman.level.CollisionMap collisionMap23 = null;
        try {
            nl.tudelft.jpacman.level.Level level24 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, ghostList1, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList15, collisionMap23);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ghostArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(ghostArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(squareArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass7 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite8 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray9 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite8 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) (byte) 10, true);
        animatedSprite12.setAnimating(false);
        animatedSprite12.setAnimating(true);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite12, (int) (byte) 0, 0, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(spriteArray9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite13 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray14 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite13 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (byte) 10, true);
        animatedSprite17.setAnimating(false);
        animatedSprite17.setAnimating(true);
        animatedSprite17.restart();
        nl.tudelft.jpacman.sprite.Sprite sprite23 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray24 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite23 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray24, (int) (byte) 10, true);
        animatedSprite27.setAnimating(false);
        animatedSprite27.restart();
        java.lang.Class<?> wildcardClass31 = animatedSprite27.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite32 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray33 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite32 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite36 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite40 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite43 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, 0, false);
        nl.tudelft.jpacman.sprite.Sprite sprite44 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray45 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite44 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite48 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite52 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite56 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite60 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite63 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, 100, true);
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites64 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite66 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite68 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite70 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray71 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite12, animatedSprite17, animatedSprite27, animatedSprite43, animatedSprite63, sprite70 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite74 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, 10, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite77 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, (int) ' ', true);
        java.lang.Class<?> wildcardClass78 = spriteArray71.getClass();
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray14);
        org.junit.Assert.assertNotNull(spriteArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(spriteArray33);
        org.junit.Assert.assertNotNull(spriteArray45);
        org.junit.Assert.assertNotNull(sprite66);
        org.junit.Assert.assertNotNull(sprite68);
        org.junit.Assert.assertNotNull(sprite70);
        org.junit.Assert.assertNotNull(spriteArray71);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = null;
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass7 = pacManSprites0.getClass();
        try {
            java.util.Map<nl.tudelft.jpacman.board.Direction, nl.tudelft.jpacman.sprite.Sprite> directionMap8 = pacManSprites0.getPacmanSprites();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/pacman.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        boolean boolean15 = false; // flaky: level8.isAnyPlayerAlive();
        try {
            int int16 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite13 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray14 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite13 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (byte) 10, true);
        animatedSprite17.setAnimating(false);
        animatedSprite17.setAnimating(true);
        animatedSprite17.restart();
        nl.tudelft.jpacman.sprite.Sprite sprite23 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray24 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite23 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray24, (int) (byte) 10, true);
        animatedSprite27.setAnimating(false);
        animatedSprite27.restart();
        java.lang.Class<?> wildcardClass31 = animatedSprite27.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite32 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray33 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite32 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite36 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite40 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite43 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, 0, false);
        nl.tudelft.jpacman.sprite.Sprite sprite44 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray45 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite44 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite48 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite52 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite56 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite60 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite63 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, 100, true);
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites64 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite66 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite68 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite70 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray71 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite12, animatedSprite17, animatedSprite27, animatedSprite43, animatedSprite63, sprite70 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite74 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, 10, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite77 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, 1, true);
        animatedSprite77.restart();
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray14);
        org.junit.Assert.assertNotNull(spriteArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(spriteArray33);
        org.junit.Assert.assertNotNull(spriteArray45);
        org.junit.Assert.assertNotNull(sprite66);
        org.junit.Assert.assertNotNull(sprite68);
        org.junit.Assert.assertNotNull(sprite70);
        org.junit.Assert.assertNotNull(spriteArray71);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite9 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray10 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite9 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray10, (int) (byte) 10, true);
        animatedSprite13.setAnimating(false);
        animatedSprite13.setAnimating(true);
        animatedSprite13.restart();
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite22 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite13, 0, 1, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(spriteArray10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.setAnimating(false);
        java.awt.Graphics graphics10 = null;
        try {
// flaky:             animatedSprite4.draw(graphics10, (int) (short) 100, (int) (byte) -1, (int) (short) 1, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite9 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray10 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite9 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray10, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray10, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray10, (int) (byte) 100, true, true);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite24 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite20, (int) (byte) 1, (int) 'a', true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(spriteArray10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '#', false, false);
        java.awt.Graphics graphics13 = null;
        try {
// flaky:             animatedSprite12.draw(graphics13, (int) (byte) 1, (int) '4', (int) (byte) 0, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        java.awt.Graphics graphics9 = null;
        try {
// flaky:             animatedSprite8.draw(graphics9, 0, (int) (byte) 1, (int) '4', 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite14 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', true);
        animatedSprite14.restart();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite20 = null; // flaky: animatedSprite14.split((int) '4', (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false);
        java.awt.Graphics graphics8 = null;
        try {
// flaky:             animatedSprite7.draw(graphics8, (int) (short) -1, (int) (short) 1, (int) '4', (int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board11 = null; // flaky: level8.getBoard();
        try {
            java.lang.Class<?> wildcardClass12 = board11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.setAnimating(true);
        animatedSprite4.restart();
        try {
            int int10 = 0; // flaky: animatedSprite4.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite19 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite22 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) -1, false);
        animatedSprite22.setAnimating(false);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = pacManSprites0.getPacManDeathAnimation();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/dead.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass9 = pacManSprites0.getClass();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite10 = pacManSprites0.getPelletSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/pellet.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '4', false);
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray14 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite13 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite18 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (short) 0, false, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite21 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (short) 100, false);
        try {
            int int22 = 0; // flaky: animatedSprite21.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray14);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite5 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray6 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite5 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite9 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray6, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray6, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray6, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite18 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray6, (int) '4', false);
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray19 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite18 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite23 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray19, (int) (short) 0, false, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite26 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray19, (int) (short) 100, false);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite30 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite26, (int) (byte) 100, (int) (byte) 0, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(spriteArray6);
        org.junit.Assert.assertNotNull(spriteArray19);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.setAnimating(true);
        animatedSprite4.restart();
        animatedSprite4.restart();
        java.awt.Graphics graphics11 = null;
        try {
// flaky:             animatedSprite4.draw(graphics11, (int) (byte) 10, (int) (short) 0, (-1), (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '4', false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 1, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, false);
        java.awt.Graphics graphics21 = null;
        try {
// flaky:             animatedSprite20.draw(graphics21, (-1), 10, (int) '4', (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Board board15 = null; // flaky: level8.getBoard();
        try {
            int int16 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertNull(board15);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 100, false, false);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite21 = null; // flaky: animatedSprite16.split((int) (byte) 100, 0, (int) (short) -1, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.restart();
        try {
            int int6 = 0; // flaky: animatedSprite4.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite10 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite11 = pacManSprites0.getWallSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/wall.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(sprite10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.restart();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite15 = null; // flaky: animatedSprite4.split((int) '4', 100, (int) (byte) -1, (int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '4', false);
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray14 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite13 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite18 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (short) 0, false, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite21 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (short) 100, false);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite26 = null; // flaky: animatedSprite21.split((int) (byte) 10, 100, (int) (byte) 0, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray14);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
        boolean boolean14 = false; // flaky: level8.isAnyPlayerAlive();
        boolean boolean15 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver16 = null;
// flaky:         level8.removeObserver(levelObserver16);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver18 = null;
// flaky:         level8.removeObserver(levelObserver18);
        try {
            int int20 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        boolean boolean11 = false; // flaky: level8.isInProgress();
        boolean boolean12 = false; // flaky: level8.isInProgress();
        boolean boolean13 = false; // flaky: level8.isInProgress();
        boolean boolean14 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        boolean boolean17 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit18 = null;
        nl.tudelft.jpacman.board.Direction direction19 = null;
// flaky:         level8.move(unit18, direction19);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver21 = null;
// flaky:         level8.removeObserver(levelObserver21);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver23 = null;
// flaky:         level8.addObserver(levelObserver23);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Unit unit9 = null;
        nl.tudelft.jpacman.board.Direction direction10 = null;
// flaky:         level8.move(unit9, direction10);
        boolean boolean12 = false; // flaky: level8.isInProgress();
// flaky:         level8.stop();
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(board14);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        boolean boolean17 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit18 = null;
        nl.tudelft.jpacman.board.Direction direction19 = null;
// flaky:         level8.move(unit18, direction19);
        nl.tudelft.jpacman.board.Unit unit21 = null;
        nl.tudelft.jpacman.board.Direction direction22 = null;
// flaky:         level8.move(unit21, direction22);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Unit unit9 = null;
        nl.tudelft.jpacman.board.Direction direction10 = null;
// flaky:         level8.move(unit9, direction10);
        boolean boolean12 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.level.Player player13 = null;
        try {
// flaky:             level8.registerPlayer(player13);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite9 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray10 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite9 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray10, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass14 = animatedSprite13.getClass();
        animatedSprite13.setAnimating(true);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite13, (int) (short) 10, (-1), true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(spriteArray10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite13 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray14 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite13 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (byte) 10, true);
        animatedSprite17.setAnimating(false);
        animatedSprite17.setAnimating(true);
        animatedSprite17.restart();
        nl.tudelft.jpacman.sprite.Sprite sprite23 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray24 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite23 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray24, (int) (byte) 10, true);
        animatedSprite27.setAnimating(false);
        animatedSprite27.restart();
        java.lang.Class<?> wildcardClass31 = animatedSprite27.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite32 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray33 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite32 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite36 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite40 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite43 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, 0, false);
        nl.tudelft.jpacman.sprite.Sprite sprite44 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray45 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite44 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite48 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite52 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite56 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite60 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite63 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, 100, true);
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites64 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite66 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite68 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite70 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray71 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite12, animatedSprite17, animatedSprite27, animatedSprite43, animatedSprite63, sprite70 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite74 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, 10, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite77 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, (int) (short) -1, false);
        try {
            int int78 = 0; // flaky: animatedSprite77.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray14);
        org.junit.Assert.assertNotNull(spriteArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(spriteArray33);
        org.junit.Assert.assertNotNull(spriteArray45);
        org.junit.Assert.assertNotNull(sprite66);
        org.junit.Assert.assertNotNull(sprite68);
        org.junit.Assert.assertNotNull(sprite70);
        org.junit.Assert.assertNotNull(spriteArray71);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass9 = pacManSprites0.getClass();
        try {
            java.util.Map<nl.tudelft.jpacman.board.Direction, nl.tudelft.jpacman.sprite.Sprite> directionMap10 = pacManSprites0.getPacmanSprites();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/pacman.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver11 = null;
// flaky:         level8.removeObserver(levelObserver11);
        boolean boolean13 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver14 = null;
// flaky:         level8.addObserver(levelObserver14);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass9 = pacManSprites0.getClass();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite10 = pacManSprites0.getGroundSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/floor.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite1 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray2 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite1 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite5 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray2, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite9 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray2, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray2, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray2, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray2, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite23 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray2, (int) (short) -1, false);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite23, (int) (short) 10, (int) (short) 10, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray2);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (int) (byte) -1, false, false);
        nl.tudelft.jpacman.sprite.Sprite sprite12 = null; // flaky: animatedSprite7.split((int) (short) -1, 10, (int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(spriteArray0);
// flaky:         org.junit.Assert.assertNotNull(sprite12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        boolean boolean14 = false; // flaky: level8.isInProgress();
        boolean boolean15 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        boolean boolean15 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit16 = null;
        nl.tudelft.jpacman.board.Direction direction17 = null;
// flaky:         level8.move(unit16, direction17);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver19 = null;
// flaky:         level8.removeObserver(levelObserver19);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 10, true);
        int int4 = 0; // flaky: animatedSprite3.getWidth();
        org.junit.Assert.assertNotNull(spriteArray0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        animatedSprite7.setAnimating(false);
        animatedSprite7.setAnimating(false);
        java.lang.Class<?> wildcardClass12 = animatedSprite7.getClass();
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.board.Unit unit17 = null;
        nl.tudelft.jpacman.board.Direction direction18 = null;
// flaky:         level8.move(unit17, direction18);
        boolean boolean20 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        java.lang.Class<?> wildcardClass8 = animatedSprite4.getClass();
        java.awt.Graphics graphics9 = null;
        try {
// flaky:             animatedSprite4.draw(graphics9, 1, (int) (byte) 100, (-1), (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        java.lang.Class<?> wildcardClass8 = animatedSprite4.getClass();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite13 = null; // flaky: animatedSprite4.split(1, (int) (byte) -1, (int) (byte) 10, (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass9 = pacManSprites0.getClass();
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = pacManSprites0.getPacManDeathAnimation();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/dead.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver10 = null;
// flaky:         level8.addObserver(levelObserver10);
        boolean boolean12 = false; // flaky: level8.isAnyPlayerAlive();
        java.lang.Class<?> wildcardClass13 = null; // flaky: level8.getClass();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver14 = null;
// flaky:         level8.addObserver(levelObserver14);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 10, true);
// flaky:         animatedSprite3.setAnimating(true);
        org.junit.Assert.assertNotNull(spriteArray0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        java.lang.Class<?> wildcardClass8 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.setAnimating(true);
        java.awt.Graphics graphics15 = null;
        try {
// flaky:             animatedSprite4.draw(graphics15, 0, (int) (short) 10, (int) (short) 1, (int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray3 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList4 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList4, ghostArray3);
        nl.tudelft.jpacman.board.Square[] squareArray6 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList7 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList7, squareArray6);
        nl.tudelft.jpacman.level.CollisionMap collisionMap9 = null;
        nl.tudelft.jpacman.level.Level level10 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList7, collisionMap9);
        nl.tudelft.jpacman.board.Square[] squareArray11 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList12 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList12, squareArray11);
        nl.tudelft.jpacman.level.CollisionMap collisionMap14 = null;
        nl.tudelft.jpacman.level.Level level15 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList12, collisionMap14);
        nl.tudelft.jpacman.board.Board board16 = null;
        nl.tudelft.jpacman.board.Board board17 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray18 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList19 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList19, ghostArray18);
        nl.tudelft.jpacman.board.Square[] squareArray21 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList22 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList22, squareArray21);
        nl.tudelft.jpacman.level.CollisionMap collisionMap24 = null;
        nl.tudelft.jpacman.level.Level level25 = null; // flaky: new nl.tudelft.jpacman.level.Level(board17, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList22, collisionMap24);
        nl.tudelft.jpacman.board.Square[] squareArray26 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList27 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList27, squareArray26);
        nl.tudelft.jpacman.level.CollisionMap collisionMap29 = null;
        nl.tudelft.jpacman.level.Level level30 = null; // flaky: new nl.tudelft.jpacman.level.Level(board16, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap29);
        nl.tudelft.jpacman.level.CollisionMap collisionMap31 = null;
        nl.tudelft.jpacman.level.Level level32 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap31);
        nl.tudelft.jpacman.board.Unit unit33 = null;
        nl.tudelft.jpacman.board.Direction direction34 = null;
// flaky:         level32.move(unit33, direction34);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver36 = null;
// flaky:         level32.addObserver(levelObserver36);
        org.junit.Assert.assertNotNull(ghostArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(squareArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ghostArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(squareArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(squareArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite10 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.npc.ghost.GhostColor ghostColor11 = null;
        try {
            java.util.Map<nl.tudelft.jpacman.board.Direction, nl.tudelft.jpacman.sprite.Sprite> directionMap12 = null; // flaky: pacManSprites0.getGhostSprite(ghostColor11);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(sprite10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        animatedSprite11.setAnimating(true);
        animatedSprite11.setAnimating(false);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass9 = pacManSprites0.getClass();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite11 = pacManSprites0.loadSprite("hi!");
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: hi!");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray3 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList4 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList4, ghostArray3);
        nl.tudelft.jpacman.board.Square[] squareArray6 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList7 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList7, squareArray6);
        nl.tudelft.jpacman.level.CollisionMap collisionMap9 = null;
        nl.tudelft.jpacman.level.Level level10 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList7, collisionMap9);
        nl.tudelft.jpacman.board.Square[] squareArray11 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList12 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList12, squareArray11);
        nl.tudelft.jpacman.level.CollisionMap collisionMap14 = null;
        nl.tudelft.jpacman.level.Level level15 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList12, collisionMap14);
        nl.tudelft.jpacman.board.Board board16 = null;
        nl.tudelft.jpacman.board.Board board17 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray18 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList19 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList19, ghostArray18);
        nl.tudelft.jpacman.board.Square[] squareArray21 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList22 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList22, squareArray21);
        nl.tudelft.jpacman.level.CollisionMap collisionMap24 = null;
        nl.tudelft.jpacman.level.Level level25 = null; // flaky: new nl.tudelft.jpacman.level.Level(board17, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList22, collisionMap24);
        nl.tudelft.jpacman.board.Square[] squareArray26 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList27 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList27, squareArray26);
        nl.tudelft.jpacman.level.CollisionMap collisionMap29 = null;
        nl.tudelft.jpacman.level.Level level30 = null; // flaky: new nl.tudelft.jpacman.level.Level(board16, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap29);
        nl.tudelft.jpacman.level.CollisionMap collisionMap31 = null;
        nl.tudelft.jpacman.level.Level level32 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap31);
        nl.tudelft.jpacman.board.Unit unit33 = null;
        nl.tudelft.jpacman.board.Direction direction34 = null;
// flaky:         level32.move(unit33, direction34);
        boolean boolean36 = false; // flaky: level32.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver37 = null;
// flaky:         level32.addObserver(levelObserver37);
        org.junit.Assert.assertNotNull(ghostArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(squareArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ghostArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(squareArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(squareArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.restart();
        java.awt.Graphics graphics9 = null;
        try {
// flaky:             animatedSprite4.draw(graphics9, (int) (short) 10, (int) '#', (int) (byte) 1, (int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        java.lang.Class<?> wildcardClass7 = animatedSprite4.getClass();
        try {
            int int8 = 0; // flaky: animatedSprite4.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite13 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray14 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite13 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (byte) 10, true);
        animatedSprite17.setAnimating(false);
        animatedSprite17.setAnimating(true);
        animatedSprite17.restart();
        nl.tudelft.jpacman.sprite.Sprite sprite23 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray24 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite23 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray24, (int) (byte) 10, true);
        animatedSprite27.setAnimating(false);
        animatedSprite27.restart();
        java.lang.Class<?> wildcardClass31 = animatedSprite27.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite32 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray33 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite32 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite36 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite40 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite43 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, 0, false);
        nl.tudelft.jpacman.sprite.Sprite sprite44 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray45 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite44 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite48 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite52 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite56 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite60 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite63 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, 100, true);
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites64 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite66 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite68 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite70 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray71 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite12, animatedSprite17, animatedSprite27, animatedSprite43, animatedSprite63, sprite70 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite74 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, 10, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite77 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, (int) ' ', true);
        try {
            int int78 = 0; // flaky: animatedSprite77.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray14);
        org.junit.Assert.assertNotNull(spriteArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(spriteArray33);
        org.junit.Assert.assertNotNull(spriteArray45);
        org.junit.Assert.assertNotNull(sprite66);
        org.junit.Assert.assertNotNull(sprite68);
        org.junit.Assert.assertNotNull(sprite70);
        org.junit.Assert.assertNotNull(spriteArray71);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        java.lang.Class<?> wildcardClass8 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.setAnimating(false);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite17 = null; // flaky: animatedSprite4.split((int) '4', (int) '#', (int) (byte) 1, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver10 = null;
// flaky:         level8.addObserver(levelObserver10);
        boolean boolean12 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit13 = null;
        nl.tudelft.jpacman.board.Direction direction14 = null;
// flaky:         level8.move(unit13, direction14);
        boolean boolean16 = false; // flaky: level8.isAnyPlayerAlive();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray3 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList4 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList4, ghostArray3);
        nl.tudelft.jpacman.board.Square[] squareArray6 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList7 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList7, squareArray6);
        nl.tudelft.jpacman.level.CollisionMap collisionMap9 = null;
        nl.tudelft.jpacman.level.Level level10 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList7, collisionMap9);
        nl.tudelft.jpacman.board.Square[] squareArray11 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList12 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList12, squareArray11);
        nl.tudelft.jpacman.level.CollisionMap collisionMap14 = null;
        nl.tudelft.jpacman.level.Level level15 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList12, collisionMap14);
        nl.tudelft.jpacman.board.Board board16 = null;
        nl.tudelft.jpacman.board.Board board17 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray18 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList19 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList19, ghostArray18);
        nl.tudelft.jpacman.board.Square[] squareArray21 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList22 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList22, squareArray21);
        nl.tudelft.jpacman.level.CollisionMap collisionMap24 = null;
        nl.tudelft.jpacman.level.Level level25 = null; // flaky: new nl.tudelft.jpacman.level.Level(board17, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList22, collisionMap24);
        nl.tudelft.jpacman.board.Square[] squareArray26 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList27 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList27, squareArray26);
        nl.tudelft.jpacman.level.CollisionMap collisionMap29 = null;
        nl.tudelft.jpacman.level.Level level30 = null; // flaky: new nl.tudelft.jpacman.level.Level(board16, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap29);
        nl.tudelft.jpacman.level.CollisionMap collisionMap31 = null;
        nl.tudelft.jpacman.level.Level level32 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap31);
        boolean boolean33 = false; // flaky: level32.isInProgress();
        try {
            level32.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(squareArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ghostArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(squareArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(squareArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite9 = pacManSprites0.getGroundSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/floor.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        java.lang.Class<?> wildcardClass14 = null; // flaky: level8.getClass();
        boolean boolean15 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.board.Unit unit16 = null;
        nl.tudelft.jpacman.board.Direction direction17 = null;
// flaky:         level8.move(unit16, direction17);
        nl.tudelft.jpacman.board.Unit unit19 = null;
        nl.tudelft.jpacman.board.Direction direction20 = null;
// flaky:         level8.move(unit19, direction20);
// flaky:         level8.stop();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        java.lang.Class<?> wildcardClass11 = null; // flaky: level8.getClass();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver14 = null;
// flaky:         level8.removeObserver(levelObserver14);
        nl.tudelft.jpacman.board.Unit unit16 = null;
        nl.tudelft.jpacman.board.Direction direction17 = null;
// flaky:         level8.move(unit16, direction17);
        nl.tudelft.jpacman.board.Board board19 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver20 = null;
// flaky:         level8.addObserver(levelObserver20);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(board19);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite10 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = pacManSprites0.getPacManDeathAnimation();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/dead.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(sprite10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        animatedSprite8.restart();
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        animatedSprite11.setAnimating(true);
        animatedSprite11.restart();
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.board.Unit unit17 = null;
        nl.tudelft.jpacman.board.Direction direction18 = null;
// flaky:         level8.move(unit17, direction18);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver20 = null;
// flaky:         level8.addObserver(levelObserver20);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Unit unit9 = null;
        nl.tudelft.jpacman.board.Direction direction10 = null;
// flaky:         level8.move(unit9, direction10);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver13 = null;
// flaky:         level8.removeObserver(levelObserver13);
        nl.tudelft.jpacman.board.Board board15 = null; // flaky: level8.getBoard();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board15);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
        boolean boolean14 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level8.move(unit15, direction16);
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        java.lang.Class<?> wildcardClass8 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        java.awt.Graphics graphics11 = null;
        try {
// flaky:             animatedSprite4.draw(graphics11, (int) (byte) 100, 0, (int) (byte) 10, (int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        boolean boolean11 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level8.move(unit15, direction16);
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(board14);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board11 = null; // flaky: level8.getBoard();
        java.lang.Class<?> wildcardClass12 = null; // flaky: level8.getClass();
        boolean boolean13 = false; // flaky: level8.isAnyPlayerAlive();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board11);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass9 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite10 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray11 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite10 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite14 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray11, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass15 = animatedSprite14.getClass();
        animatedSprite14.setAnimating(true);
        animatedSprite14.setAnimating(false);
        animatedSprite14.restart();
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite24 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite14, (int) (byte) 0, (int) ' ', false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(spriteArray11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.board.Board board3 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray4 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList5 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList5, ghostArray4);
        nl.tudelft.jpacman.board.Square[] squareArray7 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList8 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList8, squareArray7);
        nl.tudelft.jpacman.level.CollisionMap collisionMap10 = null;
        nl.tudelft.jpacman.level.Level level11 = null; // flaky: new nl.tudelft.jpacman.level.Level(board3, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList8, collisionMap10);
        nl.tudelft.jpacman.board.Square[] squareArray12 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList13 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList13, squareArray12);
        nl.tudelft.jpacman.level.CollisionMap collisionMap15 = null;
        nl.tudelft.jpacman.level.Level level16 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList13, collisionMap15);
        java.util.List<nl.tudelft.jpacman.board.Square> squareList17 = null;
        nl.tudelft.jpacman.level.CollisionMap collisionMap18 = null;
        nl.tudelft.jpacman.level.Level level19 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, squareList17, collisionMap18);
        nl.tudelft.jpacman.board.Board board20 = null;
        nl.tudelft.jpacman.board.Board board21 = null;
        nl.tudelft.jpacman.board.Board board22 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray23 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList24 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList24, ghostArray23);
        nl.tudelft.jpacman.board.Square[] squareArray26 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList27 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList27, squareArray26);
        nl.tudelft.jpacman.level.CollisionMap collisionMap29 = null;
        nl.tudelft.jpacman.level.Level level30 = null; // flaky: new nl.tudelft.jpacman.level.Level(board22, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList24, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap29);
        nl.tudelft.jpacman.board.Square[] squareArray31 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList32 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList32, squareArray31);
        nl.tudelft.jpacman.level.CollisionMap collisionMap34 = null;
        nl.tudelft.jpacman.level.Level level35 = null; // flaky: new nl.tudelft.jpacman.level.Level(board21, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList24, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList32, collisionMap34);
        nl.tudelft.jpacman.board.Board board36 = null;
        nl.tudelft.jpacman.board.Board board37 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray38 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList39 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList39, ghostArray38);
        nl.tudelft.jpacman.board.Square[] squareArray41 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList42 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList42, squareArray41);
        nl.tudelft.jpacman.level.CollisionMap collisionMap44 = null;
        nl.tudelft.jpacman.level.Level level45 = null; // flaky: new nl.tudelft.jpacman.level.Level(board37, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList39, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList42, collisionMap44);
        nl.tudelft.jpacman.board.Square[] squareArray46 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList47 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList47, squareArray46);
        nl.tudelft.jpacman.level.CollisionMap collisionMap49 = null;
        nl.tudelft.jpacman.level.Level level50 = null; // flaky: new nl.tudelft.jpacman.level.Level(board36, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList39, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList47, collisionMap49);
        nl.tudelft.jpacman.level.CollisionMap collisionMap51 = null;
        nl.tudelft.jpacman.level.Level level52 = null; // flaky: new nl.tudelft.jpacman.level.Level(board20, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList24, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList47, collisionMap51);
        nl.tudelft.jpacman.level.CollisionMap collisionMap53 = null;
        nl.tudelft.jpacman.level.Level level54 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList47, collisionMap53);
        try {
            level54.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(squareArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(squareArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ghostArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(squareArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(squareArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(ghostArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(squareArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(squareArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite9 = pacManSprites0.getPelletSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/pellet.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true, false);
        try {
            int int13 = 0; // flaky: animatedSprite12.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite10 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite12 = pacManSprites0.loadSprite("hi!");
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: hi!");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(sprite10);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass7 = pacManSprites0.getClass();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.getWallSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/wall.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        java.lang.Class<?> wildcardClass11 = null; // flaky: level8.getClass();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver14 = null;
// flaky:         level8.removeObserver(levelObserver14);
        nl.tudelft.jpacman.board.Unit unit16 = null;
        nl.tudelft.jpacman.board.Direction direction17 = null;
// flaky:         level8.move(unit16, direction17);
        nl.tudelft.jpacman.board.Board board19 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Player player20 = null;
        try {
// flaky:             level8.registerPlayer(player20);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(board19);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.restart();
        animatedSprite4.setAnimating(true);
        animatedSprite4.setAnimating(true);
        try {
            int int13 = 0; // flaky: animatedSprite4.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 0, true);
        animatedSprite15.restart();
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        java.lang.Class<?> wildcardClass11 = null; // flaky: level8.getClass();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(board14);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
        boolean boolean14 = false; // flaky: level8.isAnyPlayerAlive();
        boolean boolean15 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.board.Unit unit16 = null;
        nl.tudelft.jpacman.board.Direction direction17 = null;
// flaky:         level8.move(unit16, direction17);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver19 = null;
// flaky:         level8.removeObserver(levelObserver19);
        boolean boolean21 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite7 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray8 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite7 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray8, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite14 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray8, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray8, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray8, (int) (byte) -1, true);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite24 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite20, (int) '4', (int) (byte) 100, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(spriteArray8);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        java.lang.Class<?> wildcardClass14 = null; // flaky: level8.getClass();
        boolean boolean15 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.board.Unit unit16 = null;
        nl.tudelft.jpacman.board.Direction direction17 = null;
// flaky:         level8.move(unit16, direction17);
        try {
            int int19 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite13 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray14 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite13 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (byte) 10, true);
        animatedSprite17.setAnimating(false);
        animatedSprite17.setAnimating(true);
        animatedSprite17.restart();
        nl.tudelft.jpacman.sprite.Sprite sprite23 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray24 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite23 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray24, (int) (byte) 10, true);
        animatedSprite27.setAnimating(false);
        animatedSprite27.restart();
        java.lang.Class<?> wildcardClass31 = animatedSprite27.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite32 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray33 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite32 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite36 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite40 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite43 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, 0, false);
        nl.tudelft.jpacman.sprite.Sprite sprite44 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray45 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite44 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite48 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite52 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite56 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite60 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite63 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, 100, true);
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites64 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite66 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite68 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite70 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray71 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite12, animatedSprite17, animatedSprite27, animatedSprite43, animatedSprite63, sprite70 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite74 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, 10, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite77 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, (int) (short) -1, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite81 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, 1, true, false);
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray14);
        org.junit.Assert.assertNotNull(spriteArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(spriteArray33);
        org.junit.Assert.assertNotNull(spriteArray45);
        org.junit.Assert.assertNotNull(sprite66);
        org.junit.Assert.assertNotNull(sprite68);
        org.junit.Assert.assertNotNull(sprite70);
        org.junit.Assert.assertNotNull(spriteArray71);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite18 = null; // flaky: animatedSprite13.split((int) ' ', (int) (byte) -1, (int) (byte) 0, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '4', false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 1, true, true);
        animatedSprite17.setAnimating(false);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite24 = null; // flaky: animatedSprite17.split((int) '4', (int) (byte) 10, (int) (short) 0, (int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true);
        animatedSprite13.setAnimating(false);
        try {
            int int16 = 0; // flaky: animatedSprite13.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray2 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList3 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList3, ghostArray2);
        nl.tudelft.jpacman.board.Square[] squareArray5 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList6 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList6, squareArray5);
        nl.tudelft.jpacman.level.CollisionMap collisionMap8 = null;
        nl.tudelft.jpacman.level.Level level9 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList6, collisionMap8);
        nl.tudelft.jpacman.board.Square[] squareArray10 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList11 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList11, squareArray10);
        nl.tudelft.jpacman.level.CollisionMap collisionMap13 = null;
        nl.tudelft.jpacman.level.Level level14 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList11, collisionMap13);
        boolean boolean15 = false; // flaky: level14.isAnyPlayerAlive();
        org.junit.Assert.assertNotNull(ghostArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(squareArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 0, true);
        java.lang.Class<?> wildcardClass16 = animatedSprite15.getClass();
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite10 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite11 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray12 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite11 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray12, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite19 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray12, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite23 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray12, (int) '#', false, false);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite23, (int) (short) 1, 0, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(sprite10);
        org.junit.Assert.assertNotNull(spriteArray12);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        boolean boolean17 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit18 = null;
        nl.tudelft.jpacman.board.Direction direction19 = null;
// flaky:         level8.move(unit18, direction19);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver21 = null;
// flaky:         level8.removeObserver(levelObserver21);
        boolean boolean23 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
        boolean boolean14 = false; // flaky: level8.isAnyPlayerAlive();
        boolean boolean15 = false; // flaky: level8.isAnyPlayerAlive();
        try {
            int int16 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board11 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board11);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        java.lang.Class<?> wildcardClass11 = null; // flaky: level8.getClass();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray3 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList4 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList4, ghostArray3);
        nl.tudelft.jpacman.board.Square[] squareArray6 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList7 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList7, squareArray6);
        nl.tudelft.jpacman.level.CollisionMap collisionMap9 = null;
        nl.tudelft.jpacman.level.Level level10 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList7, collisionMap9);
        nl.tudelft.jpacman.board.Square[] squareArray11 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList12 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList12, squareArray11);
        nl.tudelft.jpacman.level.CollisionMap collisionMap14 = null;
        nl.tudelft.jpacman.level.Level level15 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList12, collisionMap14);
        nl.tudelft.jpacman.board.Board board16 = null;
        nl.tudelft.jpacman.board.Board board17 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray18 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList19 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList19, ghostArray18);
        nl.tudelft.jpacman.board.Square[] squareArray21 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList22 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList22, squareArray21);
        nl.tudelft.jpacman.level.CollisionMap collisionMap24 = null;
        nl.tudelft.jpacman.level.Level level25 = null; // flaky: new nl.tudelft.jpacman.level.Level(board17, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList22, collisionMap24);
        nl.tudelft.jpacman.board.Square[] squareArray26 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList27 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList27, squareArray26);
        nl.tudelft.jpacman.level.CollisionMap collisionMap29 = null;
        nl.tudelft.jpacman.level.Level level30 = null; // flaky: new nl.tudelft.jpacman.level.Level(board16, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap29);
        nl.tudelft.jpacman.level.CollisionMap collisionMap31 = null;
        nl.tudelft.jpacman.level.Level level32 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap31);
        nl.tudelft.jpacman.board.Unit unit33 = null;
        nl.tudelft.jpacman.board.Direction direction34 = null;
// flaky:         level32.move(unit33, direction34);
        java.lang.Class<?> wildcardClass36 = null; // flaky: level32.getClass();
        org.junit.Assert.assertNotNull(ghostArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(squareArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ghostArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(squareArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(squareArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.npc.ghost.GhostColor ghostColor9 = null;
        try {
            java.util.Map<nl.tudelft.jpacman.board.Direction, nl.tudelft.jpacman.sprite.Sprite> directionMap10 = null; // flaky: pacManSprites0.getGhostSprite(ghostColor9);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite3 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray4 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite3 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray4, (int) (byte) 10, true);
        animatedSprite7.setAnimating(false);
        animatedSprite7.setAnimating(false);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite7, (-1), (int) (byte) 10, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(spriteArray4);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray2 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList3 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList3, ghostArray2);
        nl.tudelft.jpacman.board.Square[] squareArray5 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList6 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList6, squareArray5);
        nl.tudelft.jpacman.level.CollisionMap collisionMap8 = null;
        nl.tudelft.jpacman.level.Level level9 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList6, collisionMap8);
        nl.tudelft.jpacman.board.Square[] squareArray10 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList11 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList11, squareArray10);
        nl.tudelft.jpacman.level.CollisionMap collisionMap13 = null;
        nl.tudelft.jpacman.level.Level level14 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList11, collisionMap13);
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level14.move(unit15, direction16);
        try {
            level14.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(squareArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        java.lang.Class<?> wildcardClass14 = null; // flaky: level8.getClass();
// flaky:         level8.stop();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite13 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray14 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite13 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (byte) 10, true);
        animatedSprite17.setAnimating(false);
        animatedSprite17.setAnimating(true);
        animatedSprite17.restart();
        nl.tudelft.jpacman.sprite.Sprite sprite23 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray24 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite23 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray24, (int) (byte) 10, true);
        animatedSprite27.setAnimating(false);
        animatedSprite27.restart();
        java.lang.Class<?> wildcardClass31 = animatedSprite27.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite32 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray33 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite32 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite36 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite40 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite43 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, 0, false);
        nl.tudelft.jpacman.sprite.Sprite sprite44 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray45 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite44 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite48 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite52 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite56 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite60 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite63 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, 100, true);
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites64 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite66 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite68 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite70 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray71 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite12, animatedSprite17, animatedSprite27, animatedSprite43, animatedSprite63, sprite70 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite74 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, 10, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite77 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, (int) ' ', true);
        animatedSprite77.setAnimating(true);
        try {
            int int80 = 0; // flaky: animatedSprite77.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray14);
        org.junit.Assert.assertNotNull(spriteArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(spriteArray33);
        org.junit.Assert.assertNotNull(spriteArray45);
        org.junit.Assert.assertNotNull(sprite66);
        org.junit.Assert.assertNotNull(sprite68);
        org.junit.Assert.assertNotNull(sprite70);
        org.junit.Assert.assertNotNull(spriteArray71);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        boolean boolean17 = false; // flaky: level8.isAnyPlayerAlive();
        java.lang.Class<?> wildcardClass18 = null; // flaky: level8.getClass();
        boolean boolean19 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Player player20 = null;
        try {
// flaky:             level8.registerPlayer(player20);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', true, false);
        java.lang.Class<?> wildcardClass16 = spriteArray1.getClass();
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 0, true);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite20 = null; // flaky: animatedSprite15.split((int) '4', (int) (short) 1, 10, (int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = null;
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (int) '#', false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite9 = pacManSprites0.getPacManDeathAnimation();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/dead.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Board board4 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray5 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList6 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList6, ghostArray5);
        nl.tudelft.jpacman.board.Square[] squareArray8 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList9 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList9, squareArray8);
        nl.tudelft.jpacman.level.CollisionMap collisionMap11 = null;
        nl.tudelft.jpacman.level.Level level12 = null; // flaky: new nl.tudelft.jpacman.level.Level(board4, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList6, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList9, collisionMap11);
        nl.tudelft.jpacman.level.CollisionMap collisionMap13 = null;
        nl.tudelft.jpacman.level.Level level14 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList9, collisionMap13);
        java.lang.Class<?> wildcardClass15 = null; // flaky: level14.getClass();
        nl.tudelft.jpacman.board.Board board16 = null; // flaky: level14.getBoard();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(squareArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(board16);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (int) (byte) -1, false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (int) (short) 100, true, false);
// flaky:         animatedSprite11.restart();
        org.junit.Assert.assertNotNull(spriteArray0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        boolean boolean14 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver17 = null;
// flaky:         level8.removeObserver(levelObserver17);
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level8.move(unit15, direction16);
        boolean boolean18 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver19 = null;
// flaky:         level8.removeObserver(levelObserver19);
// flaky:         level8.stop();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver11 = null;
// flaky:         level8.removeObserver(levelObserver11);
        boolean boolean13 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        boolean boolean15 = false; // flaky: level8.isInProgress();
        try {
            int int16 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
// flaky:         level8.stop();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite18 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true);
        java.awt.Graphics graphics19 = null;
        try {
// flaky:             animatedSprite18.draw(graphics19, 0, 1, (int) ' ', (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board11 = null; // flaky: level8.getBoard();
        java.lang.Class<?> wildcardClass12 = null; // flaky: level8.getClass();
        nl.tudelft.jpacman.board.Unit unit13 = null;
        nl.tudelft.jpacman.board.Direction direction14 = null;
// flaky:         level8.move(unit13, direction14);
        boolean boolean16 = false; // flaky: level8.isAnyPlayerAlive();
        boolean boolean17 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board11);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.setAnimating(true);
        animatedSprite4.restart();
        animatedSprite4.setAnimating(true);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        nl.tudelft.jpacman.board.Board board0 = null;
        java.util.List<nl.tudelft.jpacman.npc.Ghost> ghostList1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.board.Board board3 = null;
        nl.tudelft.jpacman.board.Board board4 = null;
        nl.tudelft.jpacman.board.Board board5 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray6 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList7 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList7, ghostArray6);
        nl.tudelft.jpacman.board.Square[] squareArray9 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList10 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList10, squareArray9);
        nl.tudelft.jpacman.level.CollisionMap collisionMap12 = null;
        nl.tudelft.jpacman.level.Level level13 = null; // flaky: new nl.tudelft.jpacman.level.Level(board5, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList7, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList10, collisionMap12);
        nl.tudelft.jpacman.board.Square[] squareArray14 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList15 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList15, squareArray14);
        nl.tudelft.jpacman.level.CollisionMap collisionMap17 = null;
        nl.tudelft.jpacman.level.Level level18 = null; // flaky: new nl.tudelft.jpacman.level.Level(board4, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList7, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList15, collisionMap17);
        java.util.List<nl.tudelft.jpacman.board.Square> squareList19 = null;
        nl.tudelft.jpacman.level.CollisionMap collisionMap20 = null;
        nl.tudelft.jpacman.level.Level level21 = null; // flaky: new nl.tudelft.jpacman.level.Level(board3, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList7, squareList19, collisionMap20);
        nl.tudelft.jpacman.board.Board board22 = null;
        nl.tudelft.jpacman.board.Board board23 = null;
        nl.tudelft.jpacman.board.Board board24 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray25 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList26 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList26, ghostArray25);
        nl.tudelft.jpacman.board.Square[] squareArray28 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList29 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList29, squareArray28);
        nl.tudelft.jpacman.level.CollisionMap collisionMap31 = null;
        nl.tudelft.jpacman.level.Level level32 = null; // flaky: new nl.tudelft.jpacman.level.Level(board24, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList26, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList29, collisionMap31);
        nl.tudelft.jpacman.board.Square[] squareArray33 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList34 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList34, squareArray33);
        nl.tudelft.jpacman.level.CollisionMap collisionMap36 = null;
        nl.tudelft.jpacman.level.Level level37 = null; // flaky: new nl.tudelft.jpacman.level.Level(board23, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList26, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList34, collisionMap36);
        nl.tudelft.jpacman.board.Board board38 = null;
        nl.tudelft.jpacman.board.Board board39 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray40 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList41 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList41, ghostArray40);
        nl.tudelft.jpacman.board.Square[] squareArray43 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList44 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList44, squareArray43);
        nl.tudelft.jpacman.level.CollisionMap collisionMap46 = null;
        nl.tudelft.jpacman.level.Level level47 = null; // flaky: new nl.tudelft.jpacman.level.Level(board39, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList41, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList44, collisionMap46);
        nl.tudelft.jpacman.board.Square[] squareArray48 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList49 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList49, squareArray48);
        nl.tudelft.jpacman.level.CollisionMap collisionMap51 = null;
        nl.tudelft.jpacman.level.Level level52 = null; // flaky: new nl.tudelft.jpacman.level.Level(board38, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList41, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList49, collisionMap51);
        nl.tudelft.jpacman.level.CollisionMap collisionMap53 = null;
        nl.tudelft.jpacman.level.Level level54 = null; // flaky: new nl.tudelft.jpacman.level.Level(board22, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList26, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList49, collisionMap53);
        nl.tudelft.jpacman.level.CollisionMap collisionMap55 = null;
        nl.tudelft.jpacman.level.Level level56 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList7, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList49, collisionMap55);
        nl.tudelft.jpacman.level.CollisionMap collisionMap57 = null;
        try {
            nl.tudelft.jpacman.level.Level level58 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, ghostList1, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList49, collisionMap57);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(squareArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ghostArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(squareArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(squareArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(ghostArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(squareArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(squareArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', true, false);
        java.awt.Graphics graphics16 = null;
        try {
// flaky:             animatedSprite15.draw(graphics16, (int) ' ', (int) (byte) -1, (int) (short) -1, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.board.Board board17 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver18 = null;
// flaky:         level8.addObserver(levelObserver18);
        nl.tudelft.jpacman.board.Unit unit20 = null;
        nl.tudelft.jpacman.board.Direction direction21 = null;
// flaky:         level8.move(unit20, direction21);
        boolean boolean23 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray2 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList3 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList3, ghostArray2);
        nl.tudelft.jpacman.board.Square[] squareArray5 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList6 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList6, squareArray5);
        nl.tudelft.jpacman.level.CollisionMap collisionMap8 = null;
        nl.tudelft.jpacman.level.Level level9 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList6, collisionMap8);
        nl.tudelft.jpacman.board.Square[] squareArray10 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList11 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList11, squareArray10);
        nl.tudelft.jpacman.level.CollisionMap collisionMap13 = null;
        nl.tudelft.jpacman.level.Level level14 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList11, collisionMap13);
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level14.move(unit15, direction16);
        boolean boolean18 = false; // flaky: level14.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board19 = null; // flaky: level14.getBoard();
        org.junit.Assert.assertNotNull(ghostArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(squareArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(board19);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        java.lang.Class<?> wildcardClass14 = null; // flaky: level8.getClass();
        boolean boolean15 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.board.Unit unit16 = null;
        nl.tudelft.jpacman.board.Direction direction17 = null;
// flaky:         level8.move(unit16, direction17);
        nl.tudelft.jpacman.board.Unit unit19 = null;
        nl.tudelft.jpacman.board.Direction direction20 = null;
// flaky:         level8.move(unit19, direction20);
        nl.tudelft.jpacman.board.Unit unit22 = null;
        nl.tudelft.jpacman.board.Direction direction23 = null;
// flaky:         level8.move(unit22, direction23);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite13 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray14 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite13 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (byte) 10, true);
        animatedSprite17.setAnimating(false);
        animatedSprite17.setAnimating(true);
        animatedSprite17.restart();
        nl.tudelft.jpacman.sprite.Sprite sprite23 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray24 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite23 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray24, (int) (byte) 10, true);
        animatedSprite27.setAnimating(false);
        animatedSprite27.restart();
        java.lang.Class<?> wildcardClass31 = animatedSprite27.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite32 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray33 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite32 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite36 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite40 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite43 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, 0, false);
        nl.tudelft.jpacman.sprite.Sprite sprite44 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray45 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite44 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite48 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite52 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite56 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite60 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite63 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, 100, true);
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites64 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite66 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite68 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite70 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray71 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite12, animatedSprite17, animatedSprite27, animatedSprite43, animatedSprite63, sprite70 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite74 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, 10, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite77 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, 1, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite81 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, (int) (short) -1, false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite85 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, (int) (byte) -1, true, true);
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray14);
        org.junit.Assert.assertNotNull(spriteArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(spriteArray33);
        org.junit.Assert.assertNotNull(spriteArray45);
        org.junit.Assert.assertNotNull(sprite66);
        org.junit.Assert.assertNotNull(sprite68);
        org.junit.Assert.assertNotNull(sprite70);
        org.junit.Assert.assertNotNull(spriteArray71);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level8.move(unit15, direction16);
        boolean boolean18 = false; // flaky: level8.isInProgress();
        boolean boolean19 = false; // flaky: level8.isAnyPlayerAlive();
        try {
            int int20 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Board board4 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray5 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList6 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList6, ghostArray5);
        nl.tudelft.jpacman.board.Board board8 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray9 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList10 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList10, ghostArray9);
        nl.tudelft.jpacman.board.Square[] squareArray12 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList13 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList13, squareArray12);
        nl.tudelft.jpacman.level.CollisionMap collisionMap15 = null;
        nl.tudelft.jpacman.level.Level level16 = null; // flaky: new nl.tudelft.jpacman.level.Level(board8, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList10, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList13, collisionMap15);
        nl.tudelft.jpacman.level.CollisionMap collisionMap17 = null;
        nl.tudelft.jpacman.level.Level level18 = null; // flaky: new nl.tudelft.jpacman.level.Level(board4, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList6, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList13, collisionMap17);
        nl.tudelft.jpacman.level.CollisionMap collisionMap19 = null;
        nl.tudelft.jpacman.level.Level level20 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList13, collisionMap19);
        nl.tudelft.jpacman.board.Board board21 = null; // flaky: level20.getBoard();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(ghostArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(squareArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(board21);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Board board4 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray5 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList6 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList6, ghostArray5);
        nl.tudelft.jpacman.board.Square[] squareArray8 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList9 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList9, squareArray8);
        nl.tudelft.jpacman.level.CollisionMap collisionMap11 = null;
        nl.tudelft.jpacman.level.Level level12 = null; // flaky: new nl.tudelft.jpacman.level.Level(board4, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList6, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList9, collisionMap11);
        nl.tudelft.jpacman.level.CollisionMap collisionMap13 = null;
        nl.tudelft.jpacman.level.Level level14 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList9, collisionMap13);
        boolean boolean15 = false; // flaky: level14.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver16 = null;
// flaky:         level14.removeObserver(levelObserver16);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(squareArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level8.move(unit15, direction16);
        boolean boolean18 = false; // flaky: level8.isInProgress();
        try {
            int int19 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite9 = pacManSprites0.getWallSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/wall.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        java.lang.Class<?> wildcardClass14 = null; // flaky: level8.getClass();
        boolean boolean15 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.board.Unit unit16 = null;
        nl.tudelft.jpacman.board.Direction direction17 = null;
// flaky:         level8.move(unit16, direction17);
        nl.tudelft.jpacman.board.Unit unit19 = null;
        nl.tudelft.jpacman.board.Direction direction20 = null;
// flaky:         level8.move(unit19, direction20);
        boolean boolean22 = false; // flaky: level8.isInProgress();
        try {
            int int23 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite5 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray6 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite5 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite9 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray6, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray6, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray6, 0, true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite18 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray19 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite18 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite22 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray19, (int) (byte) 10, true);
        animatedSprite22.setAnimating(false);
        animatedSprite22.setAnimating(true);
        animatedSprite22.restart();
        nl.tudelft.jpacman.sprite.Sprite sprite28 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray29 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite28 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite32 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray29, (int) (byte) 10, true);
        animatedSprite32.setAnimating(false);
        animatedSprite32.restart();
        java.lang.Class<?> wildcardClass36 = animatedSprite32.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite37 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray38 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite37 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite41 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray38, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite45 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray38, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite48 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray38, 0, false);
        nl.tudelft.jpacman.sprite.Sprite sprite49 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray50 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite49 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite53 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray50, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite57 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray50, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite61 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray50, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite65 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray50, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite68 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray50, 100, true);
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites69 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite71 = pacManSprites69.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite73 = pacManSprites69.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite75 = pacManSprites69.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray76 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite17, animatedSprite22, animatedSprite32, animatedSprite48, animatedSprite68, sprite75 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite79 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray76, 10, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite82 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray76, 1, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite86 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray76, (int) (short) -1, false, false);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite90 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite86, (int) (byte) 100, (int) (byte) 1, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(spriteArray6);
        org.junit.Assert.assertNotNull(spriteArray19);
        org.junit.Assert.assertNotNull(spriteArray29);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(spriteArray38);
        org.junit.Assert.assertNotNull(spriteArray50);
        org.junit.Assert.assertNotNull(sprite71);
        org.junit.Assert.assertNotNull(sprite73);
        org.junit.Assert.assertNotNull(sprite75);
        org.junit.Assert.assertNotNull(spriteArray76);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver10 = null;
// flaky:         level8.addObserver(levelObserver10);
// flaky:         level8.stop();
        boolean boolean13 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass7 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite8 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray9 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite8 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) (short) 0, false, false);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite16, (int) (short) -1, (int) (short) 10, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(spriteArray9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.restart();
        java.awt.Graphics graphics11 = null;
        try {
// flaky:             animatedSprite4.draw(graphics11, (int) (byte) 0, (int) (byte) 1, (int) (byte) 100, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        java.lang.Class<?> wildcardClass14 = null; // flaky: level8.getClass();
        boolean boolean15 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.board.Unit unit16 = null;
        nl.tudelft.jpacman.board.Direction direction17 = null;
// flaky:         level8.move(unit16, direction17);
        boolean boolean19 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray2 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList3 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList3, ghostArray2);
        nl.tudelft.jpacman.board.Board board5 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray6 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList7 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList7, ghostArray6);
        nl.tudelft.jpacman.board.Square[] squareArray9 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList10 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList10, squareArray9);
        nl.tudelft.jpacman.level.CollisionMap collisionMap12 = null;
        nl.tudelft.jpacman.level.Level level13 = null; // flaky: new nl.tudelft.jpacman.level.Level(board5, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList7, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList10, collisionMap12);
        nl.tudelft.jpacman.level.CollisionMap collisionMap14 = null;
        nl.tudelft.jpacman.level.Level level15 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList10, collisionMap14);
        nl.tudelft.jpacman.board.Board board16 = null;
        nl.tudelft.jpacman.board.Board board17 = null;
        nl.tudelft.jpacman.board.Board board18 = null;
        nl.tudelft.jpacman.board.Board board19 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray20 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList21 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList21, ghostArray20);
        nl.tudelft.jpacman.board.Square[] squareArray23 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList24 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList24, squareArray23);
        nl.tudelft.jpacman.level.CollisionMap collisionMap26 = null;
        nl.tudelft.jpacman.level.Level level27 = null; // flaky: new nl.tudelft.jpacman.level.Level(board19, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList21, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList24, collisionMap26);
        nl.tudelft.jpacman.board.Square[] squareArray28 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList29 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList29, squareArray28);
        nl.tudelft.jpacman.level.CollisionMap collisionMap31 = null;
        nl.tudelft.jpacman.level.Level level32 = null; // flaky: new nl.tudelft.jpacman.level.Level(board18, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList21, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList29, collisionMap31);
        java.util.List<nl.tudelft.jpacman.board.Square> squareList33 = null;
        nl.tudelft.jpacman.level.CollisionMap collisionMap34 = null;
        nl.tudelft.jpacman.level.Level level35 = null; // flaky: new nl.tudelft.jpacman.level.Level(board17, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList21, squareList33, collisionMap34);
        nl.tudelft.jpacman.board.Board board36 = null;
        nl.tudelft.jpacman.board.Board board37 = null;
        nl.tudelft.jpacman.board.Board board38 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray39 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList40 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList40, ghostArray39);
        nl.tudelft.jpacman.board.Square[] squareArray42 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList43 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList43, squareArray42);
        nl.tudelft.jpacman.level.CollisionMap collisionMap45 = null;
        nl.tudelft.jpacman.level.Level level46 = null; // flaky: new nl.tudelft.jpacman.level.Level(board38, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList40, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList43, collisionMap45);
        nl.tudelft.jpacman.board.Square[] squareArray47 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList48 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList48, squareArray47);
        nl.tudelft.jpacman.level.CollisionMap collisionMap50 = null;
        nl.tudelft.jpacman.level.Level level51 = null; // flaky: new nl.tudelft.jpacman.level.Level(board37, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList40, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList48, collisionMap50);
        nl.tudelft.jpacman.board.Board board52 = null;
        nl.tudelft.jpacman.board.Board board53 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray54 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList55 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList55, ghostArray54);
        nl.tudelft.jpacman.board.Square[] squareArray57 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList58 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList58, squareArray57);
        nl.tudelft.jpacman.level.CollisionMap collisionMap60 = null;
        nl.tudelft.jpacman.level.Level level61 = null; // flaky: new nl.tudelft.jpacman.level.Level(board53, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList55, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList58, collisionMap60);
        nl.tudelft.jpacman.board.Square[] squareArray62 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList63 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList63, squareArray62);
        nl.tudelft.jpacman.level.CollisionMap collisionMap65 = null;
        nl.tudelft.jpacman.level.Level level66 = null; // flaky: new nl.tudelft.jpacman.level.Level(board52, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList55, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList63, collisionMap65);
        nl.tudelft.jpacman.level.CollisionMap collisionMap67 = null;
        nl.tudelft.jpacman.level.Level level68 = null; // flaky: new nl.tudelft.jpacman.level.Level(board36, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList40, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList63, collisionMap67);
        nl.tudelft.jpacman.level.CollisionMap collisionMap69 = null;
        nl.tudelft.jpacman.level.Level level70 = null; // flaky: new nl.tudelft.jpacman.level.Level(board16, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList21, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList63, collisionMap69);
        nl.tudelft.jpacman.level.CollisionMap collisionMap71 = null;
        nl.tudelft.jpacman.level.Level level72 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList63, collisionMap71);
        org.junit.Assert.assertNotNull(ghostArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ghostArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ghostArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(squareArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(squareArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(ghostArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(squareArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(squareArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(ghostArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(squareArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(squareArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 10, true);
        java.lang.Class<?> wildcardClass4 = spriteArray0.getClass();
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (-1), true, false);
        nl.tudelft.jpacman.sprite.Sprite sprite13 = null; // flaky: animatedSprite8.split((int) (short) 10, 100, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(spriteArray0);
        org.junit.Assert.assertNotNull(wildcardClass4);
// flaky:         org.junit.Assert.assertNotNull(sprite13);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite18 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray19 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite18 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite22 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray19, (int) (byte) 10, true);
        animatedSprite22.setAnimating(false);
        animatedSprite22.restart();
        java.lang.Class<?> wildcardClass26 = animatedSprite22.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite27 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray28 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite27 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite31 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray28, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite35 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray28, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite39 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray28, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite43 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray28, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite46 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray28, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.Sprite sprite47 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray48 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite47 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite51 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray48, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite54 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray48, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite57 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray48, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite60 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray48, (int) '4', false);
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray61 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite60 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite65 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray61, (int) (short) 0, false, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite68 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray61, (int) (short) 100, false);
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray69 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite17, animatedSprite22, animatedSprite46, animatedSprite68 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite72 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray69, (int) (short) 0, false);
        try {
            int int73 = 0; // flaky: animatedSprite72.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray19);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(spriteArray28);
        org.junit.Assert.assertNotNull(spriteArray48);
        org.junit.Assert.assertNotNull(spriteArray61);
        org.junit.Assert.assertNotNull(spriteArray69);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        animatedSprite11.setAnimating(true);
        try {
            int int14 = 0; // flaky: animatedSprite11.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray3 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList4 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList4, ghostArray3);
        nl.tudelft.jpacman.board.Square[] squareArray6 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList7 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList7, squareArray6);
        nl.tudelft.jpacman.level.CollisionMap collisionMap9 = null;
        nl.tudelft.jpacman.level.Level level10 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList7, collisionMap9);
        nl.tudelft.jpacman.board.Square[] squareArray11 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList12 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList12, squareArray11);
        nl.tudelft.jpacman.level.CollisionMap collisionMap14 = null;
        nl.tudelft.jpacman.level.Level level15 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList12, collisionMap14);
        nl.tudelft.jpacman.board.Board board16 = null;
        nl.tudelft.jpacman.board.Board board17 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray18 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList19 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList19, ghostArray18);
        nl.tudelft.jpacman.board.Square[] squareArray21 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList22 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList22, squareArray21);
        nl.tudelft.jpacman.level.CollisionMap collisionMap24 = null;
        nl.tudelft.jpacman.level.Level level25 = null; // flaky: new nl.tudelft.jpacman.level.Level(board17, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList22, collisionMap24);
        nl.tudelft.jpacman.board.Square[] squareArray26 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList27 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList27, squareArray26);
        nl.tudelft.jpacman.level.CollisionMap collisionMap29 = null;
        nl.tudelft.jpacman.level.Level level30 = null; // flaky: new nl.tudelft.jpacman.level.Level(board16, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap29);
        nl.tudelft.jpacman.level.CollisionMap collisionMap31 = null;
        nl.tudelft.jpacman.level.Level level32 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap31);
        nl.tudelft.jpacman.board.Unit unit33 = null;
        nl.tudelft.jpacman.board.Direction direction34 = null;
// flaky:         level32.move(unit33, direction34);
        boolean boolean36 = false; // flaky: level32.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver37 = null;
// flaky:         level32.removeObserver(levelObserver37);
        boolean boolean39 = false; // flaky: level32.isInProgress();
        nl.tudelft.jpacman.board.Board board40 = null; // flaky: level32.getBoard();
        org.junit.Assert.assertNotNull(ghostArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(squareArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ghostArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(squareArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(squareArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(board40);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        boolean boolean15 = false; // flaky: level8.isAnyPlayerAlive();
        boolean boolean16 = false; // flaky: level8.isInProgress();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver10 = null;
// flaky:         level8.addObserver(levelObserver10);
// flaky:         level8.stop();
// flaky:         level8.stop();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite3 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray4 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite3 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray4, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray4, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray4, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray4, (int) '4', false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray4, (int) (byte) 1, true, true);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite24 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite20, (int) 'a', (int) ' ', false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(spriteArray4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Unit unit9 = null;
        nl.tudelft.jpacman.board.Direction direction10 = null;
// flaky:         level8.move(unit9, direction10);
        boolean boolean12 = false; // flaky: level8.isInProgress();
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver14 = null;
// flaky:         level8.removeObserver(levelObserver14);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        boolean boolean15 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit16 = null;
        nl.tudelft.jpacman.board.Direction direction17 = null;
// flaky:         level8.move(unit16, direction17);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Player player20 = null;
        try {
// flaky:             level8.registerPlayer(player20);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board12 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit13 = null;
        nl.tudelft.jpacman.board.Direction direction14 = null;
// flaky:         level8.move(unit13, direction14);
        nl.tudelft.jpacman.board.Board board16 = null; // flaky: level8.getBoard();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(board12);
        org.junit.Assert.assertNull(board16);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite18 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (-1), true);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        animatedSprite7.restart();
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 0, false, false);
        animatedSprite8.setAnimating(false);
        animatedSprite8.setAnimating(false);
        try {
            int int13 = 0; // flaky: animatedSprite8.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        java.lang.Class<?> wildcardClass11 = animatedSprite10.getClass();
        java.awt.Graphics graphics12 = null;
        try {
// flaky:             animatedSprite10.draw(graphics12, 0, (int) (short) 1, (int) (byte) 100, (int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite5 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray6 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite5 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite9 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray6, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray6, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray6, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite21 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray6, (int) 'a', true, true);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite25 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite21, 0, (int) ' ', false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(spriteArray6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.board.Board board3 = null;
        nl.tudelft.jpacman.board.Board board4 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray5 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList6 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList6, ghostArray5);
        nl.tudelft.jpacman.board.Square[] squareArray8 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList9 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList9, squareArray8);
        nl.tudelft.jpacman.level.CollisionMap collisionMap11 = null;
        nl.tudelft.jpacman.level.Level level12 = null; // flaky: new nl.tudelft.jpacman.level.Level(board4, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList6, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList9, collisionMap11);
        nl.tudelft.jpacman.board.Square[] squareArray13 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList14 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList14, squareArray13);
        nl.tudelft.jpacman.level.CollisionMap collisionMap16 = null;
        nl.tudelft.jpacman.level.Level level17 = null; // flaky: new nl.tudelft.jpacman.level.Level(board3, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList6, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList14, collisionMap16);
        java.util.List<nl.tudelft.jpacman.board.Square> squareList18 = null;
        nl.tudelft.jpacman.level.CollisionMap collisionMap19 = null;
        nl.tudelft.jpacman.level.Level level20 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList6, squareList18, collisionMap19);
        nl.tudelft.jpacman.board.Board board21 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray22 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList23 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList23, ghostArray22);
        nl.tudelft.jpacman.board.Board board25 = null;
        nl.tudelft.jpacman.board.Board board26 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray27 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList28 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList28, ghostArray27);
        nl.tudelft.jpacman.board.Square[] squareArray30 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList31 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList31, squareArray30);
        nl.tudelft.jpacman.level.CollisionMap collisionMap33 = null;
        nl.tudelft.jpacman.level.Level level34 = null; // flaky: new nl.tudelft.jpacman.level.Level(board26, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList28, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList31, collisionMap33);
        nl.tudelft.jpacman.board.Square[] squareArray35 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList36 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList36, squareArray35);
        nl.tudelft.jpacman.level.CollisionMap collisionMap38 = null;
        nl.tudelft.jpacman.level.Level level39 = null; // flaky: new nl.tudelft.jpacman.level.Level(board25, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList28, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList36, collisionMap38);
        nl.tudelft.jpacman.level.CollisionMap collisionMap40 = null;
        nl.tudelft.jpacman.level.Level level41 = null; // flaky: new nl.tudelft.jpacman.level.Level(board21, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList23, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList36, collisionMap40);
        nl.tudelft.jpacman.level.CollisionMap collisionMap42 = null;
        nl.tudelft.jpacman.level.Level level43 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList6, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList36, collisionMap42);
        nl.tudelft.jpacman.board.Board board44 = null;
        nl.tudelft.jpacman.board.Board board45 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray46 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList47 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList47, ghostArray46);
        nl.tudelft.jpacman.board.Square[] squareArray49 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList50 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList50, squareArray49);
        nl.tudelft.jpacman.level.CollisionMap collisionMap52 = null;
        nl.tudelft.jpacman.level.Level level53 = null; // flaky: new nl.tudelft.jpacman.level.Level(board45, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList47, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList50, collisionMap52);
        nl.tudelft.jpacman.board.Square[] squareArray54 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList55 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList55, squareArray54);
        nl.tudelft.jpacman.level.CollisionMap collisionMap57 = null;
        nl.tudelft.jpacman.level.Level level58 = null; // flaky: new nl.tudelft.jpacman.level.Level(board44, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList47, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList55, collisionMap57);
        nl.tudelft.jpacman.level.CollisionMap collisionMap59 = null;
        nl.tudelft.jpacman.level.Level level60 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList6, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList55, collisionMap59);
        org.junit.Assert.assertNotNull(ghostArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(squareArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(squareArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(ghostArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(ghostArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(squareArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(squareArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(ghostArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(squareArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(squareArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 1, true);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite15 = null; // flaky: animatedSprite10.split(100, (int) (short) 10, 100, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Board board4 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray5 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList6 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList6, ghostArray5);
        nl.tudelft.jpacman.board.Square[] squareArray8 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList9 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList9, squareArray8);
        nl.tudelft.jpacman.level.CollisionMap collisionMap11 = null;
        nl.tudelft.jpacman.level.Level level12 = null; // flaky: new nl.tudelft.jpacman.level.Level(board4, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList6, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList9, collisionMap11);
        nl.tudelft.jpacman.level.CollisionMap collisionMap13 = null;
        nl.tudelft.jpacman.level.Level level14 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList9, collisionMap13);
// flaky:         level14.stop();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(squareArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Board board10 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertNull(board10);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level8.move(unit15, direction16);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver18 = null;
// flaky:         level8.addObserver(levelObserver18);
        nl.tudelft.jpacman.board.Board board20 = null; // flaky: level8.getBoard();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertNull(board20);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 10, true);
        java.awt.Graphics graphics4 = null;
// flaky:         animatedSprite3.draw(graphics4, 0, (int) (short) 10, (int) (short) 0, (int) (short) 1);
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray10 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite3 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray10, (int) (byte) 1, true);
        int int14 = 0; // flaky: animatedSprite13.getWidth();
        org.junit.Assert.assertNotNull(spriteArray0);
        org.junit.Assert.assertNotNull(spriteArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass7 = pacManSprites0.getClass();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite9 = pacManSprites0.loadSprite("hi!");
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: hi!");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        boolean boolean14 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver17 = null;
// flaky:         level8.removeObserver(levelObserver17);
// flaky:         level8.stop();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver10 = null;
// flaky:         level8.removeObserver(levelObserver10);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.addObserver(levelObserver12);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver14 = null;
// flaky:         level8.removeObserver(levelObserver14);
        boolean boolean16 = false; // flaky: level8.isAnyPlayerAlive();
        try {
            int int17 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 100, false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 10, true, false);
        try {
            int int21 = 0; // flaky: animatedSprite20.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '4', false);
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray14 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite13 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite18 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (short) 0, false, true);
        try {
            int int19 = 0; // flaky: animatedSprite18.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray14);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray3 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList4 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList4, ghostArray3);
        nl.tudelft.jpacman.board.Square[] squareArray6 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList7 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList7, squareArray6);
        nl.tudelft.jpacman.level.CollisionMap collisionMap9 = null;
        nl.tudelft.jpacman.level.Level level10 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList7, collisionMap9);
        nl.tudelft.jpacman.board.Square[] squareArray11 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList12 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList12, squareArray11);
        nl.tudelft.jpacman.level.CollisionMap collisionMap14 = null;
        nl.tudelft.jpacman.level.Level level15 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList12, collisionMap14);
        nl.tudelft.jpacman.board.Board board16 = null;
        nl.tudelft.jpacman.board.Board board17 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray18 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList19 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList19, ghostArray18);
        nl.tudelft.jpacman.board.Square[] squareArray21 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList22 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList22, squareArray21);
        nl.tudelft.jpacman.level.CollisionMap collisionMap24 = null;
        nl.tudelft.jpacman.level.Level level25 = null; // flaky: new nl.tudelft.jpacman.level.Level(board17, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList22, collisionMap24);
        nl.tudelft.jpacman.board.Square[] squareArray26 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList27 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList27, squareArray26);
        nl.tudelft.jpacman.level.CollisionMap collisionMap29 = null;
        nl.tudelft.jpacman.level.Level level30 = null; // flaky: new nl.tudelft.jpacman.level.Level(board16, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap29);
        nl.tudelft.jpacman.level.CollisionMap collisionMap31 = null;
        nl.tudelft.jpacman.level.Level level32 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap31);
        nl.tudelft.jpacman.board.Unit unit33 = null;
        nl.tudelft.jpacman.board.Direction direction34 = null;
// flaky:         level32.move(unit33, direction34);
        boolean boolean36 = false; // flaky: level32.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver37 = null;
// flaky:         level32.removeObserver(levelObserver37);
        boolean boolean39 = false; // flaky: level32.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver40 = null;
// flaky:         level32.addObserver(levelObserver40);
        org.junit.Assert.assertNotNull(ghostArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(squareArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ghostArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(squareArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(squareArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass7 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite8 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray9 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite8 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite19 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) (byte) 100, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite22 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) ' ', true);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite26 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite22, (int) '4', (int) (short) 10, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(spriteArray9);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.board.Board board17 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit18 = null;
        nl.tudelft.jpacman.board.Direction direction19 = null;
// flaky:         level8.move(unit18, direction19);
        nl.tudelft.jpacman.board.Unit unit21 = null;
        nl.tudelft.jpacman.board.Direction direction22 = null;
// flaky:         level8.move(unit21, direction22);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver24 = null;
// flaky:         level8.removeObserver(levelObserver24);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver26 = null;
// flaky:         level8.removeObserver(levelObserver26);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board17);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite10 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite11 = pacManSprites0.getPelletSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/pellet.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(sprite10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite13 = null; // flaky: animatedSprite8.split((-1), (int) (short) 100, (int) 'a', (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass9 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray10 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray10, 10, true);
        java.awt.Graphics graphics14 = null;
// flaky:         animatedSprite13.draw(graphics14, 0, (int) (byte) 10, (int) (short) -1, (int) (byte) 0);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite23 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite13, (-1), 10, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(spriteArray10);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.board.Board board3 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray4 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList5 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList5, ghostArray4);
        nl.tudelft.jpacman.board.Square[] squareArray7 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList8 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList8, squareArray7);
        nl.tudelft.jpacman.level.CollisionMap collisionMap10 = null;
        nl.tudelft.jpacman.level.Level level11 = null; // flaky: new nl.tudelft.jpacman.level.Level(board3, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList8, collisionMap10);
        nl.tudelft.jpacman.board.Square[] squareArray12 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList13 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList13, squareArray12);
        nl.tudelft.jpacman.level.CollisionMap collisionMap15 = null;
        nl.tudelft.jpacman.level.Level level16 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList13, collisionMap15);
        java.util.List<nl.tudelft.jpacman.board.Square> squareList17 = null;
        nl.tudelft.jpacman.level.CollisionMap collisionMap18 = null;
        nl.tudelft.jpacman.level.Level level19 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, squareList17, collisionMap18);
        nl.tudelft.jpacman.board.Board board20 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray21 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList22 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList22, ghostArray21);
        nl.tudelft.jpacman.board.Board board24 = null;
        nl.tudelft.jpacman.board.Board board25 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray26 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList27 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList27, ghostArray26);
        nl.tudelft.jpacman.board.Square[] squareArray29 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList30 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList30, squareArray29);
        nl.tudelft.jpacman.level.CollisionMap collisionMap32 = null;
        nl.tudelft.jpacman.level.Level level33 = null; // flaky: new nl.tudelft.jpacman.level.Level(board25, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList27, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList30, collisionMap32);
        nl.tudelft.jpacman.board.Square[] squareArray34 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList35 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList35, squareArray34);
        nl.tudelft.jpacman.level.CollisionMap collisionMap37 = null;
        nl.tudelft.jpacman.level.Level level38 = null; // flaky: new nl.tudelft.jpacman.level.Level(board24, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList27, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList35, collisionMap37);
        nl.tudelft.jpacman.level.CollisionMap collisionMap39 = null;
        nl.tudelft.jpacman.level.Level level40 = null; // flaky: new nl.tudelft.jpacman.level.Level(board20, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList22, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList35, collisionMap39);
        nl.tudelft.jpacman.level.CollisionMap collisionMap41 = null;
        nl.tudelft.jpacman.level.Level level42 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList35, collisionMap41);
        nl.tudelft.jpacman.board.Board board43 = null; // flaky: level42.getBoard();
        org.junit.Assert.assertNotNull(ghostArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(squareArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(squareArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ghostArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(ghostArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(squareArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(squareArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(board43);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        boolean boolean17 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit18 = null;
        nl.tudelft.jpacman.board.Direction direction19 = null;
// flaky:         level8.move(unit18, direction19);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver21 = null;
// flaky:         level8.removeObserver(levelObserver21);
        java.lang.Class<?> wildcardClass23 = null; // flaky: level8.getClass();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.board.Board board17 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit18 = null;
        nl.tudelft.jpacman.board.Direction direction19 = null;
// flaky:         level8.move(unit18, direction19);
        nl.tudelft.jpacman.board.Unit unit21 = null;
        nl.tudelft.jpacman.board.Direction direction22 = null;
// flaky:         level8.move(unit21, direction22);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver24 = null;
// flaky:         level8.addObserver(levelObserver24);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board17);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', true, false);
        java.awt.Graphics graphics16 = null;
        try {
// flaky:             animatedSprite15.draw(graphics16, (int) ' ', (int) '#', 1, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite13 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray14 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite13 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (byte) 10, true);
        animatedSprite17.setAnimating(false);
        animatedSprite17.setAnimating(true);
        animatedSprite17.restart();
        nl.tudelft.jpacman.sprite.Sprite sprite23 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray24 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite23 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray24, (int) (byte) 10, true);
        animatedSprite27.setAnimating(false);
        animatedSprite27.restart();
        java.lang.Class<?> wildcardClass31 = animatedSprite27.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite32 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray33 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite32 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite36 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite40 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite43 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, 0, false);
        nl.tudelft.jpacman.sprite.Sprite sprite44 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray45 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite44 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite48 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite52 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite56 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite60 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite63 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, 100, true);
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites64 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite66 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite68 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite70 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray71 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite12, animatedSprite17, animatedSprite27, animatedSprite43, animatedSprite63, sprite70 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite74 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, 10, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite77 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, 1, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite81 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, (int) (short) -1, false, false);
        animatedSprite81.setAnimating(false);
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray14);
        org.junit.Assert.assertNotNull(spriteArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(spriteArray33);
        org.junit.Assert.assertNotNull(spriteArray45);
        org.junit.Assert.assertNotNull(sprite66);
        org.junit.Assert.assertNotNull(sprite68);
        org.junit.Assert.assertNotNull(sprite70);
        org.junit.Assert.assertNotNull(spriteArray71);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite1 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray2 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite1 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite5 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray2, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite9 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray2, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray2, 0, true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite14 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray15 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite14 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite18 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray15, (int) (byte) 10, true);
        animatedSprite18.setAnimating(false);
        animatedSprite18.setAnimating(true);
        animatedSprite18.restart();
        nl.tudelft.jpacman.sprite.Sprite sprite24 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray25 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite24 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite28 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray25, (int) (byte) 10, true);
        animatedSprite28.setAnimating(false);
        animatedSprite28.restart();
        java.lang.Class<?> wildcardClass32 = animatedSprite28.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite33 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray34 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite33 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite37 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray34, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite41 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray34, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite44 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray34, 0, false);
        nl.tudelft.jpacman.sprite.Sprite sprite45 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray46 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite45 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite49 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray46, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite53 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray46, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite57 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray46, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite61 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray46, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite64 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray46, 100, true);
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites65 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite67 = pacManSprites65.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite69 = pacManSprites65.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite71 = pacManSprites65.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray72 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite13, animatedSprite18, animatedSprite28, animatedSprite44, animatedSprite64, sprite71 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite75 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray72, 10, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite78 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray72, (int) ' ', true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite81 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray72, (int) '#', true);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite85 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite81, (int) ' ', (int) (short) -1, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray2);
        org.junit.Assert.assertNotNull(spriteArray15);
        org.junit.Assert.assertNotNull(spriteArray25);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(spriteArray34);
        org.junit.Assert.assertNotNull(spriteArray46);
        org.junit.Assert.assertNotNull(sprite67);
        org.junit.Assert.assertNotNull(sprite69);
        org.junit.Assert.assertNotNull(sprite71);
        org.junit.Assert.assertNotNull(spriteArray72);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.restart();
        java.lang.Class<?> wildcardClass8 = animatedSprite4.getClass();
        try {
            int int9 = 0; // flaky: animatedSprite4.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board11 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.addObserver(levelObserver12);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver14 = null;
// flaky:         level8.addObserver(levelObserver14);
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board11);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        boolean boolean17 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit18 = null;
        nl.tudelft.jpacman.board.Direction direction19 = null;
// flaky:         level8.move(unit18, direction19);
        boolean boolean21 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board22 = null; // flaky: level8.getBoard();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(board22);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
        boolean boolean14 = false; // flaky: level8.isAnyPlayerAlive();
        boolean boolean15 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board16 = null; // flaky: level8.getBoard();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(board16);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        boolean boolean15 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit16 = null;
        nl.tudelft.jpacman.board.Direction direction17 = null;
// flaky:         level8.move(unit16, direction17);
// flaky:         level8.stop();
        boolean boolean20 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Board board4 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray5 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList6 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList6, ghostArray5);
        nl.tudelft.jpacman.board.Board board8 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray9 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList10 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList10, ghostArray9);
        nl.tudelft.jpacman.board.Square[] squareArray12 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList13 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList13, squareArray12);
        nl.tudelft.jpacman.level.CollisionMap collisionMap15 = null;
        nl.tudelft.jpacman.level.Level level16 = null; // flaky: new nl.tudelft.jpacman.level.Level(board8, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList10, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList13, collisionMap15);
        nl.tudelft.jpacman.level.CollisionMap collisionMap17 = null;
        nl.tudelft.jpacman.level.Level level18 = null; // flaky: new nl.tudelft.jpacman.level.Level(board4, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList6, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList13, collisionMap17);
        nl.tudelft.jpacman.level.CollisionMap collisionMap19 = null;
        nl.tudelft.jpacman.level.Level level20 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList13, collisionMap19);
// flaky:         level20.stop();
        try {
            level20.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(ghostArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(squareArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite18 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray19 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite18 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite22 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray19, (int) (byte) 10, true);
        animatedSprite22.setAnimating(false);
        animatedSprite22.restart();
        java.lang.Class<?> wildcardClass26 = animatedSprite22.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite27 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray28 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite27 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite31 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray28, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite35 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray28, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite39 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray28, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite43 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray28, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite46 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray28, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.Sprite sprite47 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray48 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite47 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite51 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray48, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite54 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray48, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite57 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray48, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite60 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray48, (int) '4', false);
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray61 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite60 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite65 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray61, (int) (short) 0, false, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite68 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray61, (int) (short) 100, false);
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray69 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite17, animatedSprite22, animatedSprite46, animatedSprite68 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite72 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray69, (int) (short) 0, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite75 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray69, (int) (byte) 100, true);
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray19);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(spriteArray28);
        org.junit.Assert.assertNotNull(spriteArray48);
        org.junit.Assert.assertNotNull(spriteArray61);
        org.junit.Assert.assertNotNull(spriteArray69);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass7 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite8 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray9 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite8 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite24 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, 100, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite30 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) (short) 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite34 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, 0, false, true);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite38 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite34, 0, (int) (short) 10, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(spriteArray9);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.restart();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite15 = null; // flaky: animatedSprite4.split((int) (byte) 1, 1, (int) (byte) 10, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        animatedSprite11.setAnimating(true);
        try {
            int int14 = 0; // flaky: animatedSprite11.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Unit unit9 = null;
        nl.tudelft.jpacman.board.Direction direction10 = null;
// flaky:         level8.move(unit9, direction10);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver13 = null;
// flaky:         level8.removeObserver(levelObserver13);
        try {
            int int15 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level8.move(unit15, direction16);
        boolean boolean18 = false; // flaky: level8.isInProgress();
        boolean boolean19 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        java.lang.Class<?> wildcardClass11 = null; // flaky: level8.getClass();
        try {
            int int12 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 10, true);
        java.awt.Graphics graphics4 = null;
// flaky:         animatedSprite3.draw(graphics4, 0, (int) (short) 10, (int) (short) 0, (int) (short) 1);
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray10 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite3 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray10, (int) (byte) 1, true);
        int int14 = 0; // flaky: animatedSprite13.getHeight();
        animatedSprite13.setAnimating(false);
        org.junit.Assert.assertNotNull(spriteArray0);
        org.junit.Assert.assertNotNull(spriteArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver17 = null;
// flaky:         level8.addObserver(levelObserver17);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver19 = null;
// flaky:         level8.removeObserver(levelObserver19);
        nl.tudelft.jpacman.board.Board board21 = null; // flaky: level8.getBoard();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board21);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '4', false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 1, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite23 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 100, false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 10, true, false);
        try {
            int int21 = 0; // flaky: animatedSprite20.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '4', false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 1, true, true);
        animatedSprite17.setAnimating(false);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite24 = null; // flaky: animatedSprite17.split((int) (short) 1, (int) (short) -1, 1, (int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass7 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite8 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray9 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite8 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray9, (int) ' ', false, false);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite16, (int) (byte) -1, 100, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(spriteArray9);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        boolean boolean17 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver18 = null;
// flaky:         level8.addObserver(levelObserver18);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver20 = null;
// flaky:         level8.removeObserver(levelObserver20);
        boolean boolean22 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.board.Board board3 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray4 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList5 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList5, ghostArray4);
        nl.tudelft.jpacman.board.Square[] squareArray7 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList8 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList8, squareArray7);
        nl.tudelft.jpacman.level.CollisionMap collisionMap10 = null;
        nl.tudelft.jpacman.level.Level level11 = null; // flaky: new nl.tudelft.jpacman.level.Level(board3, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList8, collisionMap10);
        nl.tudelft.jpacman.board.Square[] squareArray12 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList13 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList13, squareArray12);
        nl.tudelft.jpacman.level.CollisionMap collisionMap15 = null;
        nl.tudelft.jpacman.level.Level level16 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList13, collisionMap15);
        nl.tudelft.jpacman.board.Board board17 = null;
        nl.tudelft.jpacman.board.Board board18 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray19 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList20 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList20, ghostArray19);
        nl.tudelft.jpacman.board.Square[] squareArray22 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList23 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList23, squareArray22);
        nl.tudelft.jpacman.level.CollisionMap collisionMap25 = null;
        nl.tudelft.jpacman.level.Level level26 = null; // flaky: new nl.tudelft.jpacman.level.Level(board18, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList20, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList23, collisionMap25);
        nl.tudelft.jpacman.board.Square[] squareArray27 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList28 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList28, squareArray27);
        nl.tudelft.jpacman.level.CollisionMap collisionMap30 = null;
        nl.tudelft.jpacman.level.Level level31 = null; // flaky: new nl.tudelft.jpacman.level.Level(board17, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList20, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList28, collisionMap30);
        nl.tudelft.jpacman.level.CollisionMap collisionMap32 = null;
        nl.tudelft.jpacman.level.Level level33 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList28, collisionMap32);
        nl.tudelft.jpacman.board.Square[] squareArray34 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList35 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList35, squareArray34);
        nl.tudelft.jpacman.level.CollisionMap collisionMap37 = null;
        nl.tudelft.jpacman.level.Level level38 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList35, collisionMap37);
        org.junit.Assert.assertNotNull(ghostArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(squareArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(squareArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ghostArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(squareArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(squareArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(squareArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver11 = null;
// flaky:         level8.removeObserver(levelObserver11);
        boolean boolean13 = false; // flaky: level8.isInProgress();
        boolean boolean14 = false; // flaky: level8.isAnyPlayerAlive();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.board.Board board3 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray4 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList5 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList5, ghostArray4);
        nl.tudelft.jpacman.board.Square[] squareArray7 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList8 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList8, squareArray7);
        nl.tudelft.jpacman.level.CollisionMap collisionMap10 = null;
        nl.tudelft.jpacman.level.Level level11 = null; // flaky: new nl.tudelft.jpacman.level.Level(board3, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList8, collisionMap10);
        nl.tudelft.jpacman.board.Square[] squareArray12 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList13 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList13, squareArray12);
        nl.tudelft.jpacman.level.CollisionMap collisionMap15 = null;
        nl.tudelft.jpacman.level.Level level16 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList13, collisionMap15);
        java.util.List<nl.tudelft.jpacman.board.Square> squareList17 = null;
        nl.tudelft.jpacman.level.CollisionMap collisionMap18 = null;
        nl.tudelft.jpacman.level.Level level19 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, squareList17, collisionMap18);
        nl.tudelft.jpacman.board.Board board20 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray21 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList22 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList22, ghostArray21);
        nl.tudelft.jpacman.board.Board board24 = null;
        nl.tudelft.jpacman.board.Board board25 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray26 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList27 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList27, ghostArray26);
        nl.tudelft.jpacman.board.Square[] squareArray29 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList30 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList30, squareArray29);
        nl.tudelft.jpacman.level.CollisionMap collisionMap32 = null;
        nl.tudelft.jpacman.level.Level level33 = null; // flaky: new nl.tudelft.jpacman.level.Level(board25, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList27, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList30, collisionMap32);
        nl.tudelft.jpacman.board.Square[] squareArray34 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList35 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList35, squareArray34);
        nl.tudelft.jpacman.level.CollisionMap collisionMap37 = null;
        nl.tudelft.jpacman.level.Level level38 = null; // flaky: new nl.tudelft.jpacman.level.Level(board24, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList27, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList35, collisionMap37);
        nl.tudelft.jpacman.level.CollisionMap collisionMap39 = null;
        nl.tudelft.jpacman.level.Level level40 = null; // flaky: new nl.tudelft.jpacman.level.Level(board20, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList22, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList35, collisionMap39);
        nl.tudelft.jpacman.level.CollisionMap collisionMap41 = null;
        nl.tudelft.jpacman.level.Level level42 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList5, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList35, collisionMap41);
        boolean boolean43 = false; // flaky: level42.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(squareArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(squareArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ghostArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(ghostArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(squareArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(squareArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        boolean boolean14 = false; // flaky: level8.isInProgress();
        boolean boolean15 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Player player16 = null;
        try {
// flaky:             level8.registerPlayer(player16);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite19 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, false);
        java.awt.Graphics graphics20 = null;
        try {
// flaky:             animatedSprite19.draw(graphics20, 10, (-1), 100, (int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver10 = null;
// flaky:         level8.removeObserver(levelObserver10);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.addObserver(levelObserver12);
        nl.tudelft.jpacman.board.Unit unit14 = null;
        nl.tudelft.jpacman.board.Direction direction15 = null;
// flaky:         level8.move(unit14, direction15);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite6 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (int) (byte) -1, false);
        org.junit.Assert.assertNotNull(spriteArray0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite12 = null; // flaky: animatedSprite7.split((int) (short) 10, (int) (short) 0, (int) (byte) 10, (int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        animatedSprite7.setAnimating(false);
        animatedSprite7.setAnimating(true);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite7 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray8 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite7 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray8, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite14 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray8, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray8, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray8, (int) (byte) -1, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite24 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray8, (int) ' ', true, true);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite28 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite24, (int) '#', (int) ' ', true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(spriteArray8);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true);
        animatedSprite13.setAnimating(false);
        try {
            int int16 = 0; // flaky: animatedSprite13.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (int) (byte) -1, false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (int) (short) 100, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (int) (byte) 10, true, true);
        org.junit.Assert.assertNotNull(spriteArray0);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
// flaky:         level8.stop();
        boolean boolean16 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board17 = null; // flaky: level8.getBoard();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(board17);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level8.move(unit15, direction16);
        boolean boolean18 = false; // flaky: level8.isInProgress();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Board board4 = null;
        nl.tudelft.jpacman.board.Board board5 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray6 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList7 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList7, ghostArray6);
        nl.tudelft.jpacman.board.Square[] squareArray9 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList10 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList10, squareArray9);
        nl.tudelft.jpacman.level.CollisionMap collisionMap12 = null;
        nl.tudelft.jpacman.level.Level level13 = null; // flaky: new nl.tudelft.jpacman.level.Level(board5, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList7, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList10, collisionMap12);
        nl.tudelft.jpacman.board.Square[] squareArray14 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList15 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList15, squareArray14);
        nl.tudelft.jpacman.level.CollisionMap collisionMap17 = null;
        nl.tudelft.jpacman.level.Level level18 = null; // flaky: new nl.tudelft.jpacman.level.Level(board4, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList7, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList15, collisionMap17);
        nl.tudelft.jpacman.level.CollisionMap collisionMap19 = null;
        nl.tudelft.jpacman.level.Level level20 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList15, collisionMap19);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver21 = null;
// flaky:         level20.removeObserver(levelObserver21);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(squareArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Board board4 = null;
        nl.tudelft.jpacman.board.Board board5 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray6 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList7 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList7, ghostArray6);
        nl.tudelft.jpacman.board.Square[] squareArray9 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList10 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList10, squareArray9);
        nl.tudelft.jpacman.level.CollisionMap collisionMap12 = null;
        nl.tudelft.jpacman.level.Level level13 = null; // flaky: new nl.tudelft.jpacman.level.Level(board5, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList7, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList10, collisionMap12);
        nl.tudelft.jpacman.board.Square[] squareArray14 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList15 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList15, squareArray14);
        nl.tudelft.jpacman.level.CollisionMap collisionMap17 = null;
        nl.tudelft.jpacman.level.Level level18 = null; // flaky: new nl.tudelft.jpacman.level.Level(board4, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList7, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList15, collisionMap17);
        nl.tudelft.jpacman.level.CollisionMap collisionMap19 = null;
        nl.tudelft.jpacman.level.Level level20 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList15, collisionMap19);
        nl.tudelft.jpacman.board.Unit unit21 = null;
        nl.tudelft.jpacman.board.Direction direction22 = null;
// flaky:         level20.move(unit21, direction22);
        nl.tudelft.jpacman.board.Board board24 = null; // flaky: level20.getBoard();
// flaky:         level20.stop();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(squareArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(board24);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite19 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite22 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite26 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, false, true);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite31 = null; // flaky: animatedSprite26.split((int) (byte) 10, (-1), 10, (int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 1, true);
        try {
            int int11 = 0; // flaky: animatedSprite10.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        java.lang.Class<?> wildcardClass11 = null; // flaky: level8.getClass();
        boolean boolean12 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray2 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList3 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList3, ghostArray2);
        nl.tudelft.jpacman.board.Board board5 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray6 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList7 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList7, ghostArray6);
        nl.tudelft.jpacman.board.Square[] squareArray9 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList10 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList10, squareArray9);
        nl.tudelft.jpacman.level.CollisionMap collisionMap12 = null;
        nl.tudelft.jpacman.level.Level level13 = null; // flaky: new nl.tudelft.jpacman.level.Level(board5, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList7, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList10, collisionMap12);
        nl.tudelft.jpacman.level.CollisionMap collisionMap14 = null;
        nl.tudelft.jpacman.level.Level level15 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList10, collisionMap14);
        nl.tudelft.jpacman.board.Board board16 = null;
        nl.tudelft.jpacman.board.Board board17 = null;
        nl.tudelft.jpacman.board.Board board18 = null;
        nl.tudelft.jpacman.board.Board board19 = null;
        nl.tudelft.jpacman.board.Board board20 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray21 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList22 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList22, ghostArray21);
        nl.tudelft.jpacman.board.Square[] squareArray24 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList25 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList25, squareArray24);
        nl.tudelft.jpacman.level.CollisionMap collisionMap27 = null;
        nl.tudelft.jpacman.level.Level level28 = null; // flaky: new nl.tudelft.jpacman.level.Level(board20, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList22, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList25, collisionMap27);
        nl.tudelft.jpacman.board.Square[] squareArray29 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList30 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList30, squareArray29);
        nl.tudelft.jpacman.level.CollisionMap collisionMap32 = null;
        nl.tudelft.jpacman.level.Level level33 = null; // flaky: new nl.tudelft.jpacman.level.Level(board19, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList22, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList30, collisionMap32);
        java.util.List<nl.tudelft.jpacman.board.Square> squareList34 = null;
        nl.tudelft.jpacman.level.CollisionMap collisionMap35 = null;
        nl.tudelft.jpacman.level.Level level36 = null; // flaky: new nl.tudelft.jpacman.level.Level(board18, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList22, squareList34, collisionMap35);
        nl.tudelft.jpacman.board.Board board37 = null;
        nl.tudelft.jpacman.board.Board board38 = null;
        nl.tudelft.jpacman.board.Board board39 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray40 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList41 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList41, ghostArray40);
        nl.tudelft.jpacman.board.Square[] squareArray43 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList44 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList44, squareArray43);
        nl.tudelft.jpacman.level.CollisionMap collisionMap46 = null;
        nl.tudelft.jpacman.level.Level level47 = null; // flaky: new nl.tudelft.jpacman.level.Level(board39, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList41, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList44, collisionMap46);
        nl.tudelft.jpacman.board.Square[] squareArray48 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList49 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList49, squareArray48);
        nl.tudelft.jpacman.level.CollisionMap collisionMap51 = null;
        nl.tudelft.jpacman.level.Level level52 = null; // flaky: new nl.tudelft.jpacman.level.Level(board38, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList41, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList49, collisionMap51);
        nl.tudelft.jpacman.board.Board board53 = null;
        nl.tudelft.jpacman.board.Board board54 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray55 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList56 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList56, ghostArray55);
        nl.tudelft.jpacman.board.Square[] squareArray58 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList59 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList59, squareArray58);
        nl.tudelft.jpacman.level.CollisionMap collisionMap61 = null;
        nl.tudelft.jpacman.level.Level level62 = null; // flaky: new nl.tudelft.jpacman.level.Level(board54, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList56, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList59, collisionMap61);
        nl.tudelft.jpacman.board.Square[] squareArray63 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList64 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList64, squareArray63);
        nl.tudelft.jpacman.level.CollisionMap collisionMap66 = null;
        nl.tudelft.jpacman.level.Level level67 = null; // flaky: new nl.tudelft.jpacman.level.Level(board53, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList56, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList64, collisionMap66);
        nl.tudelft.jpacman.level.CollisionMap collisionMap68 = null;
        nl.tudelft.jpacman.level.Level level69 = null; // flaky: new nl.tudelft.jpacman.level.Level(board37, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList41, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList64, collisionMap68);
        nl.tudelft.jpacman.level.CollisionMap collisionMap70 = null;
        nl.tudelft.jpacman.level.Level level71 = null; // flaky: new nl.tudelft.jpacman.level.Level(board17, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList22, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList64, collisionMap70);
        nl.tudelft.jpacman.board.Board board72 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray73 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList74 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList74, ghostArray73);
        nl.tudelft.jpacman.board.Board board76 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray77 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList78 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList78, ghostArray77);
        nl.tudelft.jpacman.board.Square[] squareArray80 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList81 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList81, squareArray80);
        nl.tudelft.jpacman.level.CollisionMap collisionMap83 = null;
        nl.tudelft.jpacman.level.Level level84 = null; // flaky: new nl.tudelft.jpacman.level.Level(board76, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList78, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList81, collisionMap83);
        nl.tudelft.jpacman.level.CollisionMap collisionMap85 = null;
        nl.tudelft.jpacman.level.Level level86 = null; // flaky: new nl.tudelft.jpacman.level.Level(board72, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList74, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList81, collisionMap85);
        nl.tudelft.jpacman.level.CollisionMap collisionMap87 = null;
        nl.tudelft.jpacman.level.Level level88 = null; // flaky: new nl.tudelft.jpacman.level.Level(board16, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList22, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList81, collisionMap87);
        nl.tudelft.jpacman.level.CollisionMap collisionMap89 = null;
        nl.tudelft.jpacman.level.Level level90 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList81, collisionMap89);
        nl.tudelft.jpacman.level.Player player91 = null;
        try {
// flaky:             level90.registerPlayer(player91);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ghostArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ghostArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(squareArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(squareArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(ghostArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(squareArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(squareArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(ghostArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(squareArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(squareArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(ghostArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(ghostArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(squareArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 10, true);
        java.lang.Class<?> wildcardClass4 = spriteArray0.getClass();
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (-1), true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (int) (short) -1, false, false);
        org.junit.Assert.assertNotNull(spriteArray0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Board board4 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray5 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList6 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList6, ghostArray5);
        nl.tudelft.jpacman.board.Square[] squareArray8 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList9 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList9, squareArray8);
        nl.tudelft.jpacman.level.CollisionMap collisionMap11 = null;
        nl.tudelft.jpacman.level.Level level12 = null; // flaky: new nl.tudelft.jpacman.level.Level(board4, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList6, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList9, collisionMap11);
        nl.tudelft.jpacman.level.CollisionMap collisionMap13 = null;
        nl.tudelft.jpacman.level.Level level14 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList9, collisionMap13);
        boolean boolean15 = false; // flaky: level14.isInProgress();
        try {
            int int16 = level14.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(squareArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level8.move(unit15, direction16);
        boolean boolean18 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver19 = null;
// flaky:         level8.removeObserver(levelObserver19);
        boolean boolean21 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver22 = null;
// flaky:         level8.removeObserver(levelObserver22);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        boolean boolean14 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.board.Board board15 = null; // flaky: level8.getBoard();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(board15);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass9 = pacManSprites0.getClass();
        nl.tudelft.jpacman.npc.ghost.GhostColor ghostColor10 = null;
        try {
            java.util.Map<nl.tudelft.jpacman.board.Direction, nl.tudelft.jpacman.sprite.Sprite> directionMap11 = null; // flaky: pacManSprites0.getGhostSprite(ghostColor10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        animatedSprite11.setAnimating(false);
        java.awt.Graphics graphics14 = null;
        try {
// flaky:             animatedSprite11.draw(graphics14, (int) '#', 100, (int) (short) 10, (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 10, true);
// flaky:         animatedSprite3.setAnimating(false);
        org.junit.Assert.assertNotNull(spriteArray0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver11 = null;
// flaky:         level8.removeObserver(levelObserver11);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver13 = null;
// flaky:         level8.removeObserver(levelObserver13);
        boolean boolean15 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver16 = null;
// flaky:         level8.removeObserver(levelObserver16);
        boolean boolean18 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        java.lang.Class<?> wildcardClass14 = null; // flaky: level8.getClass();
        boolean boolean15 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Player player16 = null;
        try {
// flaky:             level8.registerPlayer(player16);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray3 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList4 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList4, ghostArray3);
        nl.tudelft.jpacman.board.Board board6 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray7 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList8 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList8, ghostArray7);
        nl.tudelft.jpacman.board.Square[] squareArray10 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList11 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList11, squareArray10);
        nl.tudelft.jpacman.level.CollisionMap collisionMap13 = null;
        nl.tudelft.jpacman.level.Level level14 = null; // flaky: new nl.tudelft.jpacman.level.Level(board6, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList8, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList11, collisionMap13);
        nl.tudelft.jpacman.level.CollisionMap collisionMap15 = null;
        nl.tudelft.jpacman.level.Level level16 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList11, collisionMap15);
        nl.tudelft.jpacman.board.Board board17 = null;
        nl.tudelft.jpacman.board.Board board18 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray19 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList20 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList20, ghostArray19);
        nl.tudelft.jpacman.board.Square[] squareArray22 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList23 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList23, squareArray22);
        nl.tudelft.jpacman.level.CollisionMap collisionMap25 = null;
        nl.tudelft.jpacman.level.Level level26 = null; // flaky: new nl.tudelft.jpacman.level.Level(board18, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList20, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList23, collisionMap25);
        nl.tudelft.jpacman.board.Square[] squareArray27 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList28 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList28, squareArray27);
        nl.tudelft.jpacman.level.CollisionMap collisionMap30 = null;
        nl.tudelft.jpacman.level.Level level31 = null; // flaky: new nl.tudelft.jpacman.level.Level(board17, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList20, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList28, collisionMap30);
        nl.tudelft.jpacman.level.CollisionMap collisionMap32 = null;
        nl.tudelft.jpacman.level.Level level33 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList28, collisionMap32);
        java.util.List<nl.tudelft.jpacman.board.Square> squareList34 = null;
        nl.tudelft.jpacman.level.CollisionMap collisionMap35 = null;
        nl.tudelft.jpacman.level.Level level36 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, squareList34, collisionMap35);
        org.junit.Assert.assertNotNull(ghostArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ghostArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(squareArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ghostArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(squareArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(squareArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 10, true);
        java.awt.Graphics graphics4 = null;
// flaky:         animatedSprite3.draw(graphics4, 0, (int) (short) 10, (int) (short) 0, (int) (short) 1);
// flaky:         animatedSprite3.setAnimating(false);
        org.junit.Assert.assertNotNull(spriteArray0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 1, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '#', false, false);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true, false);
        try {
            int int13 = 0; // flaky: animatedSprite12.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite10 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite12 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite13 = pacManSprites0.getWallSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/wall.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(sprite10);
        org.junit.Assert.assertNotNull(sprite12);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.restart();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite12 = null; // flaky: animatedSprite4.split((int) (short) 1, (int) (short) 10, 0, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite19 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite23 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 10, false, true);
        nl.tudelft.jpacman.sprite.Sprite sprite28 = null; // flaky: animatedSprite23.split((int) ' ', (int) (short) 10, (-1), 0);
        org.junit.Assert.assertNotNull(spriteArray1);
// flaky:         org.junit.Assert.assertNotNull(sprite28);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', true, true);
        java.awt.Graphics graphics18 = null;
        try {
// flaky:             animatedSprite17.draw(graphics18, (int) (short) 1, 10, (int) '4', (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray2 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList3 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList3, ghostArray2);
        nl.tudelft.jpacman.board.Board board5 = null;
        nl.tudelft.jpacman.board.Board board6 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray7 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList8 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList8, ghostArray7);
        nl.tudelft.jpacman.board.Square[] squareArray10 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList11 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList11, squareArray10);
        nl.tudelft.jpacman.level.CollisionMap collisionMap13 = null;
        nl.tudelft.jpacman.level.Level level14 = null; // flaky: new nl.tudelft.jpacman.level.Level(board6, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList8, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList11, collisionMap13);
        nl.tudelft.jpacman.board.Square[] squareArray15 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList16 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList16, squareArray15);
        nl.tudelft.jpacman.level.CollisionMap collisionMap18 = null;
        nl.tudelft.jpacman.level.Level level19 = null; // flaky: new nl.tudelft.jpacman.level.Level(board5, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList8, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList16, collisionMap18);
        nl.tudelft.jpacman.level.CollisionMap collisionMap20 = null;
        nl.tudelft.jpacman.level.Level level21 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList16, collisionMap20);
        java.util.List<nl.tudelft.jpacman.board.Square> squareList22 = null;
        nl.tudelft.jpacman.level.CollisionMap collisionMap23 = null;
        nl.tudelft.jpacman.level.Level level24 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, squareList22, collisionMap23);
// flaky:         level24.stop();
        nl.tudelft.jpacman.level.Player player26 = null;
        try {
            level24.registerPlayer(player26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ghostArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(squareArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(squareArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite19 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, false);
        animatedSprite19.restart();
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray2 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList3 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList3, ghostArray2);
        nl.tudelft.jpacman.board.Board board5 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray6 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList7 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList7, ghostArray6);
        nl.tudelft.jpacman.board.Square[] squareArray9 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList10 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList10, squareArray9);
        nl.tudelft.jpacman.level.CollisionMap collisionMap12 = null;
        nl.tudelft.jpacman.level.Level level13 = null; // flaky: new nl.tudelft.jpacman.level.Level(board5, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList7, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList10, collisionMap12);
        nl.tudelft.jpacman.level.CollisionMap collisionMap14 = null;
        nl.tudelft.jpacman.level.Level level15 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList10, collisionMap14);
        nl.tudelft.jpacman.board.Board board16 = null;
        nl.tudelft.jpacman.board.Board board17 = null;
        nl.tudelft.jpacman.board.Board board18 = null;
        nl.tudelft.jpacman.board.Board board19 = null;
        nl.tudelft.jpacman.board.Board board20 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray21 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList22 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList22, ghostArray21);
        nl.tudelft.jpacman.board.Square[] squareArray24 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList25 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList25, squareArray24);
        nl.tudelft.jpacman.level.CollisionMap collisionMap27 = null;
        nl.tudelft.jpacman.level.Level level28 = null; // flaky: new nl.tudelft.jpacman.level.Level(board20, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList22, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList25, collisionMap27);
        nl.tudelft.jpacman.board.Square[] squareArray29 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList30 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList30, squareArray29);
        nl.tudelft.jpacman.level.CollisionMap collisionMap32 = null;
        nl.tudelft.jpacman.level.Level level33 = null; // flaky: new nl.tudelft.jpacman.level.Level(board19, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList22, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList30, collisionMap32);
        java.util.List<nl.tudelft.jpacman.board.Square> squareList34 = null;
        nl.tudelft.jpacman.level.CollisionMap collisionMap35 = null;
        nl.tudelft.jpacman.level.Level level36 = null; // flaky: new nl.tudelft.jpacman.level.Level(board18, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList22, squareList34, collisionMap35);
        nl.tudelft.jpacman.board.Board board37 = null;
        nl.tudelft.jpacman.board.Board board38 = null;
        nl.tudelft.jpacman.board.Board board39 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray40 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList41 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList41, ghostArray40);
        nl.tudelft.jpacman.board.Square[] squareArray43 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList44 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList44, squareArray43);
        nl.tudelft.jpacman.level.CollisionMap collisionMap46 = null;
        nl.tudelft.jpacman.level.Level level47 = null; // flaky: new nl.tudelft.jpacman.level.Level(board39, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList41, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList44, collisionMap46);
        nl.tudelft.jpacman.board.Square[] squareArray48 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList49 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList49, squareArray48);
        nl.tudelft.jpacman.level.CollisionMap collisionMap51 = null;
        nl.tudelft.jpacman.level.Level level52 = null; // flaky: new nl.tudelft.jpacman.level.Level(board38, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList41, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList49, collisionMap51);
        nl.tudelft.jpacman.board.Board board53 = null;
        nl.tudelft.jpacman.board.Board board54 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray55 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList56 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList56, ghostArray55);
        nl.tudelft.jpacman.board.Square[] squareArray58 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList59 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList59, squareArray58);
        nl.tudelft.jpacman.level.CollisionMap collisionMap61 = null;
        nl.tudelft.jpacman.level.Level level62 = null; // flaky: new nl.tudelft.jpacman.level.Level(board54, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList56, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList59, collisionMap61);
        nl.tudelft.jpacman.board.Square[] squareArray63 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList64 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList64, squareArray63);
        nl.tudelft.jpacman.level.CollisionMap collisionMap66 = null;
        nl.tudelft.jpacman.level.Level level67 = null; // flaky: new nl.tudelft.jpacman.level.Level(board53, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList56, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList64, collisionMap66);
        nl.tudelft.jpacman.level.CollisionMap collisionMap68 = null;
        nl.tudelft.jpacman.level.Level level69 = null; // flaky: new nl.tudelft.jpacman.level.Level(board37, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList41, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList64, collisionMap68);
        nl.tudelft.jpacman.level.CollisionMap collisionMap70 = null;
        nl.tudelft.jpacman.level.Level level71 = null; // flaky: new nl.tudelft.jpacman.level.Level(board17, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList22, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList64, collisionMap70);
        nl.tudelft.jpacman.board.Board board72 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray73 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList74 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList74, ghostArray73);
        nl.tudelft.jpacman.board.Board board76 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray77 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList78 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList78, ghostArray77);
        nl.tudelft.jpacman.board.Square[] squareArray80 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList81 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList81, squareArray80);
        nl.tudelft.jpacman.level.CollisionMap collisionMap83 = null;
        nl.tudelft.jpacman.level.Level level84 = null; // flaky: new nl.tudelft.jpacman.level.Level(board76, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList78, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList81, collisionMap83);
        nl.tudelft.jpacman.level.CollisionMap collisionMap85 = null;
        nl.tudelft.jpacman.level.Level level86 = null; // flaky: new nl.tudelft.jpacman.level.Level(board72, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList74, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList81, collisionMap85);
        nl.tudelft.jpacman.level.CollisionMap collisionMap87 = null;
        nl.tudelft.jpacman.level.Level level88 = null; // flaky: new nl.tudelft.jpacman.level.Level(board16, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList22, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList81, collisionMap87);
        nl.tudelft.jpacman.level.CollisionMap collisionMap89 = null;
        nl.tudelft.jpacman.level.Level level90 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList81, collisionMap89);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver91 = null;
// flaky:         level90.removeObserver(levelObserver91);
        org.junit.Assert.assertNotNull(ghostArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ghostArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ghostArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(squareArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(squareArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(ghostArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(squareArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(squareArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(ghostArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(squareArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(squareArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(ghostArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(ghostArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(squareArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.board.Board board2 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray3 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList4 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList4, ghostArray3);
        nl.tudelft.jpacman.board.Square[] squareArray6 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList7 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList7, squareArray6);
        nl.tudelft.jpacman.level.CollisionMap collisionMap9 = null;
        nl.tudelft.jpacman.level.Level level10 = null; // flaky: new nl.tudelft.jpacman.level.Level(board2, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList7, collisionMap9);
        nl.tudelft.jpacman.board.Square[] squareArray11 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList12 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList12, squareArray11);
        nl.tudelft.jpacman.level.CollisionMap collisionMap14 = null;
        nl.tudelft.jpacman.level.Level level15 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList12, collisionMap14);
        nl.tudelft.jpacman.board.Board board16 = null;
        nl.tudelft.jpacman.board.Board board17 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray18 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList19 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList19, ghostArray18);
        nl.tudelft.jpacman.board.Square[] squareArray21 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList22 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList22, squareArray21);
        nl.tudelft.jpacman.level.CollisionMap collisionMap24 = null;
        nl.tudelft.jpacman.level.Level level25 = null; // flaky: new nl.tudelft.jpacman.level.Level(board17, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList22, collisionMap24);
        nl.tudelft.jpacman.board.Square[] squareArray26 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList27 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList27, squareArray26);
        nl.tudelft.jpacman.level.CollisionMap collisionMap29 = null;
        nl.tudelft.jpacman.level.Level level30 = null; // flaky: new nl.tudelft.jpacman.level.Level(board16, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList19, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap29);
        nl.tudelft.jpacman.level.CollisionMap collisionMap31 = null;
        nl.tudelft.jpacman.level.Level level32 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList4, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList27, collisionMap31);
        nl.tudelft.jpacman.board.Unit unit33 = null;
        nl.tudelft.jpacman.board.Direction direction34 = null;
// flaky:         level32.move(unit33, direction34);
        boolean boolean36 = false; // flaky: level32.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver37 = null;
// flaky:         level32.removeObserver(levelObserver37);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver39 = null;
// flaky:         level32.removeObserver(levelObserver39);
        org.junit.Assert.assertNotNull(ghostArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(squareArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(squareArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ghostArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(squareArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(squareArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass9 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite11 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite12 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray13 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite12 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray13, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray13, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite24 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray13, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite28 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray13, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite31 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray13, (int) (byte) -1, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite35 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray13, 10, false, true);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite39 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite35, (int) (short) 10, (int) (byte) 0, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(sprite11);
        org.junit.Assert.assertNotNull(spriteArray13);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite14 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true, false);
        animatedSprite14.setAnimating(false);
        try {
            int int17 = 0; // flaky: animatedSprite14.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.board.Board board17 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver18 = null;
// flaky:         level8.addObserver(levelObserver18);
        nl.tudelft.jpacman.board.Unit unit20 = null;
        nl.tudelft.jpacman.board.Direction direction21 = null;
// flaky:         level8.move(unit20, direction21);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver23 = null;
// flaky:         level8.removeObserver(levelObserver23);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board17);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite19 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite22 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 0, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite25 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '4', false);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
        boolean boolean14 = false; // flaky: level8.isAnyPlayerAlive();
        boolean boolean15 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver16 = null;
// flaky:         level8.removeObserver(levelObserver16);
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.board.Board board17 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit18 = null;
        nl.tudelft.jpacman.board.Direction direction19 = null;
// flaky:         level8.move(unit18, direction19);
        nl.tudelft.jpacman.board.Unit unit21 = null;
        nl.tudelft.jpacman.board.Direction direction22 = null;
// flaky:         level8.move(unit21, direction22);
        boolean boolean24 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '4', false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 1, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, false);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite25 = null; // flaky: animatedSprite20.split((int) (short) 10, (int) (byte) -1, 100, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        java.lang.Class<?> wildcardClass12 = null; // flaky: level8.getClass();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 100, false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, true, false);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite14 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite21 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, true);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass9 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite10 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray11 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite10 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite14 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray11, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass15 = animatedSprite14.getClass();
        animatedSprite14.setAnimating(true);
        animatedSprite14.restart();
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite22 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite14, 0, 100, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(spriteArray11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver10 = null;
// flaky:         level8.addObserver(levelObserver10);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver13 = null;
// flaky:         level8.removeObserver(levelObserver13);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.restart();
        java.awt.Graphics graphics8 = null;
        try {
// flaky:             animatedSprite4.draw(graphics8, (int) (short) 1, (int) (byte) -1, (int) (byte) 1, (int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', true, false);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite20 = null; // flaky: animatedSprite15.split(100, (int) (byte) 1, (int) (short) 100, (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 0, false, false);
        animatedSprite8.setAnimating(false);
        java.awt.Graphics graphics11 = null;
        try {
// flaky:             animatedSprite8.draw(graphics11, (int) 'a', (int) (byte) 10, 1, 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite18 = null; // flaky: animatedSprite13.split((-1), (int) (short) -1, (int) (byte) -1, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver17 = null;
// flaky:         level8.addObserver(levelObserver17);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver19 = null;
// flaky:         level8.removeObserver(levelObserver19);
        nl.tudelft.jpacman.board.Board board21 = null; // flaky: level8.getBoard();
        try {
            int int22 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board21);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.board.Board board1 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray2 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList3 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList3, ghostArray2);
        nl.tudelft.jpacman.board.Square[] squareArray5 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList6 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList6, squareArray5);
        nl.tudelft.jpacman.level.CollisionMap collisionMap8 = null;
        nl.tudelft.jpacman.level.Level level9 = null; // flaky: new nl.tudelft.jpacman.level.Level(board1, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList6, collisionMap8);
        nl.tudelft.jpacman.board.Square[] squareArray10 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList11 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList11, squareArray10);
        nl.tudelft.jpacman.level.CollisionMap collisionMap13 = null;
        nl.tudelft.jpacman.level.Level level14 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList3, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList11, collisionMap13);
        nl.tudelft.jpacman.board.Board board15 = null; // flaky: level14.getBoard();
        nl.tudelft.jpacman.board.Unit unit16 = null;
        nl.tudelft.jpacman.board.Direction direction17 = null;
// flaky:         level14.move(unit16, direction17);
        org.junit.Assert.assertNotNull(ghostArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(squareArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(squareArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(board15);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 100, false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite19 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, false);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.setAnimating(false);
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass5 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite6 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray7 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite6 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray7, (int) (byte) 10, true);
        animatedSprite10.setAnimating(false);
        animatedSprite10.setAnimating(true);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite18 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite10, (int) (byte) 1, 100, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(spriteArray7);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 0, false, false);
        animatedSprite8.setAnimating(false);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite15 = null; // flaky: animatedSprite8.split(1, (int) (byte) 10, (int) (short) 1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 100, false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite19 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 1, true);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board11 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit12 = null;
        nl.tudelft.jpacman.board.Direction direction13 = null;
// flaky:         level8.move(unit12, direction13);
        java.lang.Class<?> wildcardClass15 = null; // flaky: level8.getClass();
        nl.tudelft.jpacman.board.Unit unit16 = null;
        nl.tudelft.jpacman.board.Direction direction17 = null;
// flaky:         level8.move(unit16, direction17);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board11);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite21 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '4', false, true);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass9 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite11 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite12 = pacManSprites0.getGroundSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/floor.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(sprite11);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite13 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray14 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite13 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (byte) 10, true);
        animatedSprite17.setAnimating(false);
        animatedSprite17.setAnimating(true);
        animatedSprite17.restart();
        nl.tudelft.jpacman.sprite.Sprite sprite23 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray24 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite23 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray24, (int) (byte) 10, true);
        animatedSprite27.setAnimating(false);
        animatedSprite27.restart();
        java.lang.Class<?> wildcardClass31 = animatedSprite27.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite32 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray33 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite32 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite36 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite40 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite43 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, 0, false);
        nl.tudelft.jpacman.sprite.Sprite sprite44 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray45 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite44 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite48 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite52 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite56 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite60 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite63 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, 100, true);
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites64 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite66 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite68 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite70 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray71 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite12, animatedSprite17, animatedSprite27, animatedSprite43, animatedSprite63, sprite70 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite74 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, 10, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite77 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, (int) (short) -1, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite81 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, (int) (byte) -1, false, false);
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray14);
        org.junit.Assert.assertNotNull(spriteArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(spriteArray33);
        org.junit.Assert.assertNotNull(spriteArray45);
        org.junit.Assert.assertNotNull(sprite66);
        org.junit.Assert.assertNotNull(sprite68);
        org.junit.Assert.assertNotNull(sprite70);
        org.junit.Assert.assertNotNull(spriteArray71);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite15 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite18 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true);
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite23 = null; // flaky: animatedSprite18.split((int) (byte) 0, (int) (short) 100, (int) (byte) -1, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        boolean boolean17 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit18 = null;
        nl.tudelft.jpacman.board.Direction direction19 = null;
// flaky:         level8.move(unit18, direction19);
        boolean boolean21 = false; // flaky: level8.isAnyPlayerAlive();
        boolean boolean22 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver23 = null;
// flaky:         level8.addObserver(levelObserver23);
// flaky:         level8.stop();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 1, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite14 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, true);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board12 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit13 = null;
        nl.tudelft.jpacman.board.Direction direction14 = null;
// flaky:         level8.move(unit13, direction14);
        boolean boolean16 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(board12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver10 = null;
// flaky:         level8.addObserver(levelObserver10);
        boolean boolean12 = false; // flaky: level8.isAnyPlayerAlive();
        try {
            int int13 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '4', false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 1, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite24 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '#', false, false);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver11 = null;
// flaky:         level8.removeObserver(levelObserver11);
        boolean boolean13 = false; // flaky: level8.isInProgress();
        try {
            int int14 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit15 = null;
        nl.tudelft.jpacman.board.Direction direction16 = null;
// flaky:         level8.move(unit15, direction16);
        boolean boolean18 = false; // flaky: level8.isInProgress();
        boolean boolean19 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver20 = null;
// flaky:         level8.addObserver(levelObserver20);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
        boolean boolean14 = false; // flaky: level8.isInProgress();
        boolean boolean15 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.board.Unit unit16 = null;
        nl.tudelft.jpacman.board.Direction direction17 = null;
// flaky:         level8.move(unit16, direction17);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Board board10 = null; // flaky: level8.getBoard();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        try {
            int int12 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertNull(board10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver11 = null;
// flaky:         level8.removeObserver(levelObserver11);
        boolean boolean13 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.board.Board board14 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.board.Board board17 = null; // flaky: level8.getBoard();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertNull(board17);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        java.lang.Class<?> wildcardClass11 = null; // flaky: level8.getClass();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver12 = null;
// flaky:         level8.removeObserver(levelObserver12);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver14 = null;
// flaky:         level8.removeObserver(levelObserver14);
        boolean boolean16 = false; // flaky: level8.isInProgress();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver17 = null;
// flaky:         level8.addObserver(levelObserver17);
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
// flaky:         level8.stop();
        boolean boolean11 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Player player12 = null;
        try {
// flaky:             level8.registerPlayer(player12);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 1, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite14 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 100, false, false);
        java.awt.Graphics graphics15 = null;
        try {
// flaky:             animatedSprite14.draw(graphics15, (int) (short) -1, (int) (byte) 0, (int) '4', (int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite19 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite22 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 0, false);
        animatedSprite22.restart();
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.board.Board board17 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.board.Unit unit18 = null;
        nl.tudelft.jpacman.board.Direction direction19 = null;
// flaky:         level8.move(unit18, direction19);
        java.lang.Class<?> wildcardClass21 = null; // flaky: level8.getClass();
        boolean boolean22 = false; // flaky: level8.isInProgress();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board17);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = null;
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 100, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite13 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray14 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite13 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (byte) 10, true);
        animatedSprite17.setAnimating(false);
        animatedSprite17.setAnimating(true);
        animatedSprite17.restart();
        nl.tudelft.jpacman.sprite.Sprite sprite23 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray24 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite23 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray24, (int) (byte) 10, true);
        animatedSprite27.setAnimating(false);
        animatedSprite27.restart();
        java.lang.Class<?> wildcardClass31 = animatedSprite27.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite32 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray33 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite32 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite36 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite40 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite43 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, 0, false);
        nl.tudelft.jpacman.sprite.Sprite sprite44 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray45 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite44 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite48 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite52 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite56 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite60 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite63 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, 100, true);
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites64 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite66 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite68 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite70 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray71 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite12, animatedSprite17, animatedSprite27, animatedSprite43, animatedSprite63, sprite70 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite74 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, 10, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite77 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, (int) ' ', true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite80 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, (int) '#', true);
        java.lang.Class<?> wildcardClass81 = animatedSprite80.getClass();
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray14);
        org.junit.Assert.assertNotNull(spriteArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(spriteArray33);
        org.junit.Assert.assertNotNull(spriteArray45);
        org.junit.Assert.assertNotNull(sprite66);
        org.junit.Assert.assertNotNull(sprite68);
        org.junit.Assert.assertNotNull(sprite70);
        org.junit.Assert.assertNotNull(spriteArray71);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 10, true);
        java.lang.Class<?> wildcardClass4 = spriteArray0.getClass();
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (-1), true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (int) (byte) 1, true);
        org.junit.Assert.assertNotNull(spriteArray0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 0, true, true);
        animatedSprite16.setAnimating(false);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, false);
        try {
            int int12 = 0; // flaky: animatedSprite11.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite18 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray19 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite18 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite22 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray19, (int) (byte) 10, true);
        animatedSprite22.setAnimating(false);
        animatedSprite22.restart();
        java.lang.Class<?> wildcardClass26 = animatedSprite22.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite27 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray28 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite27 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite31 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray28, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite35 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray28, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite39 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray28, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite43 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray28, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite46 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray28, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.Sprite sprite47 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray48 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite47 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite51 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray48, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite54 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray48, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite57 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray48, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite60 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray48, (int) '4', false);
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray61 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite60 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite65 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray61, (int) (short) 0, false, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite68 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray61, (int) (short) 100, false);
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray69 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite17, animatedSprite22, animatedSprite46, animatedSprite68 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite72 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray69, (int) (short) 0, false);
        java.awt.Graphics graphics73 = null;
        try {
// flaky:             animatedSprite72.draw(graphics73, (int) '#', (int) (short) 100, (int) 'a', (int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray19);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(spriteArray28);
        org.junit.Assert.assertNotNull(spriteArray48);
        org.junit.Assert.assertNotNull(spriteArray61);
        org.junit.Assert.assertNotNull(spriteArray69);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite10 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite12 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite14 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite15 = pacManSprites0.getWallSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/wall.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(sprite10);
        org.junit.Assert.assertNotNull(sprite12);
        org.junit.Assert.assertNotNull(sprite14);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.restart();
        java.lang.Class<?> wildcardClass8 = animatedSprite4.getClass();
        try {
            int int9 = 0; // flaky: animatedSprite4.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite6 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, (int) (short) -1, true);
        org.junit.Assert.assertNotNull(spriteArray0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver17 = null;
// flaky:         level8.addObserver(levelObserver17);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver19 = null;
// flaky:         level8.removeObserver(levelObserver19);
        try {
            int int21 = level8.remainingPellets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass9 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite11 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite13 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite15 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite16 = pacManSprites0.getWallSprite();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/wall.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(sprite11);
        org.junit.Assert.assertNotNull(sprite13);
        org.junit.Assert.assertNotNull(sprite15);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.restart();
        animatedSprite4.restart();
        java.lang.Class<?> wildcardClass9 = animatedSprite4.getClass();
        try {
            int int10 = 0; // flaky: animatedSprite4.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 0, false, false);
        try {
            int int9 = 0; // flaky: animatedSprite8.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        java.awt.Graphics graphics11 = null;
        try {
// flaky:             animatedSprite10.draw(graphics11, (int) (byte) 0, (int) (short) 10, (int) 'a', 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        java.lang.Class<?> wildcardClass7 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(false);
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board11 = null; // flaky: level8.getBoard();
        java.lang.Class<?> wildcardClass12 = null; // flaky: level8.getClass();
        nl.tudelft.jpacman.board.Unit unit13 = null;
        nl.tudelft.jpacman.board.Direction direction14 = null;
// flaky:         level8.move(unit13, direction14);
// flaky:         level8.stop();
        try {
            level8.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board11);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.board.Board board9 = null; // flaky: level8.getBoard();
        boolean boolean10 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.board.Board board11 = null; // flaky: level8.getBoard();
        nl.tudelft.jpacman.level.Player player12 = null;
        try {
// flaky:             level8.registerPlayer(player12);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(board11);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) '4', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 1, true, true);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        boolean boolean17 = false; // flaky: level8.isAnyPlayerAlive();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver18 = null;
// flaky:         level8.removeObserver(levelObserver18);
        nl.tudelft.jpacman.level.Player player20 = null;
        try {
// flaky:             level8.registerPlayer(player20);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out-of-bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (short) 100, false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 10, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite24 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) 'a', false);
        try {
            int int28 = 0; // flaky: animatedSprite27.getWidth();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        animatedSprite4.setAnimating(false);
        animatedSprite4.setAnimating(true);
        animatedSprite4.restart();
        try {
            nl.tudelft.jpacman.sprite.Sprite sprite14 = null; // flaky: animatedSprite4.split((int) (short) 10, (int) (byte) -1, (int) (short) 0, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass9 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite11 = pacManSprites0.loadSprite("");
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = pacManSprites0.getPacManDeathAnimation();
            org.junit.Assert.fail("Expected exception of type nl.tudelft.jpacman.PacmanConfigurationException; message: Unable to load sprite: /sprite/dead.png");
        } catch (nl.tudelft.jpacman.PacmanConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(sprite11);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite12 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true, true);
        nl.tudelft.jpacman.sprite.Sprite sprite13 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray14 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite13 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite17 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray14, (int) (byte) 10, true);
        animatedSprite17.setAnimating(false);
        animatedSprite17.setAnimating(true);
        animatedSprite17.restart();
        nl.tudelft.jpacman.sprite.Sprite sprite23 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray24 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite23 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite27 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray24, (int) (byte) 10, true);
        animatedSprite27.setAnimating(false);
        animatedSprite27.restart();
        java.lang.Class<?> wildcardClass31 = animatedSprite27.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite32 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray33 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite32 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite36 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite40 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite43 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray33, 0, false);
        nl.tudelft.jpacman.sprite.Sprite sprite44 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray45 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite44 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite48 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite52 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite56 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite60 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, (int) 'a', true, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite63 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray45, 100, true);
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites64 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite66 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite68 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite70 = pacManSprites64.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray71 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite12, animatedSprite17, animatedSprite27, animatedSprite43, animatedSprite63, sprite70 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite74 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, 10, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite77 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, (int) ' ', true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite81 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray71, (int) ' ', false, true);
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(spriteArray14);
        org.junit.Assert.assertNotNull(spriteArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(spriteArray33);
        org.junit.Assert.assertNotNull(spriteArray45);
        org.junit.Assert.assertNotNull(sprite66);
        org.junit.Assert.assertNotNull(sprite68);
        org.junit.Assert.assertNotNull(sprite70);
        org.junit.Assert.assertNotNull(spriteArray71);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray0 = new nl.tudelft.jpacman.sprite.Sprite[] {};
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite3 = null; // flaky: new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray0, 10, true);
        java.awt.Graphics graphics4 = null;
// flaky:         animatedSprite3.draw(graphics4, 0, (int) (short) 10, (int) (short) 0, (int) (short) 1);
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray10 = new nl.tudelft.jpacman.sprite.Sprite[] { animatedSprite3 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray10, (int) (byte) 1, true);
        int int14 = 0; // flaky: animatedSprite13.getHeight();
        animatedSprite13.restart();
        int int16 = 0; // flaky: animatedSprite13.getHeight();
        int int17 = 0; // flaky: animatedSprite13.getHeight();
        org.junit.Assert.assertNotNull(spriteArray0);
        org.junit.Assert.assertNotNull(spriteArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite11 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 100, true, true);
        animatedSprite11.restart();
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite14 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite18 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite21 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, false);
        try {
            int int22 = 0; // flaky: animatedSprite21.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite10 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite12 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.npc.ghost.GhostColor ghostColor13 = null;
        try {
            java.util.Map<nl.tudelft.jpacman.board.Direction, nl.tudelft.jpacman.sprite.Sprite> directionMap14 = null; // flaky: pacManSprites0.getGhostSprite(ghostColor13);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(sprite10);
        org.junit.Assert.assertNotNull(sprite12);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        java.lang.Class<?> wildcardClass5 = animatedSprite4.getClass();
        animatedSprite4.setAnimating(true);
        animatedSprite4.restart();
        animatedSprite4.setAnimating(true);
        animatedSprite4.setAnimating(true);
        try {
            int int13 = 0; // flaky: animatedSprite4.getHeight();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(spriteArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite7 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 0, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite10 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 100, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite13 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) -1, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite16 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, 1, false);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        nl.tudelft.jpacman.sprite.PacManSprites pacManSprites0 = new nl.tudelft.jpacman.sprite.PacManSprites();
        nl.tudelft.jpacman.sprite.Sprite sprite2 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite4 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite6 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite8 = pacManSprites0.loadSprite("");
        java.lang.Class<?> wildcardClass9 = pacManSprites0.getClass();
        nl.tudelft.jpacman.sprite.Sprite sprite11 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite13 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite15 = pacManSprites0.loadSprite("");
        nl.tudelft.jpacman.sprite.Sprite sprite16 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray17 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite16 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite20 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray17, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite24 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray17, (int) ' ', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite28 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray17, (int) '#', false, false);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite32 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray17, (int) 'a', true, true);
        try {
            nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite36 = null; // flaky: pacManSprites0.createAnimatedSprite((nl.tudelft.jpacman.sprite.Sprite) animatedSprite32, (int) 'a', (int) (byte) 1, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(sprite2);
        org.junit.Assert.assertNotNull(sprite4);
        org.junit.Assert.assertNotNull(sprite6);
        org.junit.Assert.assertNotNull(sprite8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(sprite11);
        org.junit.Assert.assertNotNull(sprite13);
        org.junit.Assert.assertNotNull(sprite15);
        org.junit.Assert.assertNotNull(spriteArray17);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        nl.tudelft.jpacman.sprite.Sprite sprite0 = null;
        nl.tudelft.jpacman.sprite.Sprite[] spriteArray1 = new nl.tudelft.jpacman.sprite.Sprite[] { sprite0 };
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite4 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) (byte) 10, true);
        nl.tudelft.jpacman.sprite.AnimatedSprite animatedSprite8 = new nl.tudelft.jpacman.sprite.AnimatedSprite(spriteArray1, (int) ' ', false, false);
        animatedSprite8.setAnimating(true);
        org.junit.Assert.assertNotNull(spriteArray1);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        nl.tudelft.jpacman.board.Board board0 = null;
        nl.tudelft.jpacman.npc.Ghost[] ghostArray1 = new nl.tudelft.jpacman.npc.Ghost[] {};
        java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost> ghostList2 = new java.util.ArrayList<nl.tudelft.jpacman.npc.Ghost>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.npc.Ghost>) ghostList2, ghostArray1);
        nl.tudelft.jpacman.board.Square[] squareArray4 = new nl.tudelft.jpacman.board.Square[] {};
        java.util.ArrayList<nl.tudelft.jpacman.board.Square> squareList5 = new java.util.ArrayList<nl.tudelft.jpacman.board.Square>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<nl.tudelft.jpacman.board.Square>) squareList5, squareArray4);
        nl.tudelft.jpacman.level.CollisionMap collisionMap7 = null;
        nl.tudelft.jpacman.level.Level level8 = null; // flaky: new nl.tudelft.jpacman.level.Level(board0, (java.util.List<nl.tudelft.jpacman.npc.Ghost>) ghostList2, (java.util.List<nl.tudelft.jpacman.board.Square>) squareList5, collisionMap7);
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver9 = null;
// flaky:         level8.removeObserver(levelObserver9);
        nl.tudelft.jpacman.board.Unit unit11 = null;
        nl.tudelft.jpacman.board.Direction direction12 = null;
// flaky:         level8.move(unit11, direction12);
// flaky:         level8.stop();
        nl.tudelft.jpacman.level.Level.LevelObserver levelObserver15 = null;
// flaky:         level8.removeObserver(levelObserver15);
        boolean boolean17 = false; // flaky: level8.isAnyPlayerAlive();
        java.lang.Class<?> wildcardClass18 = null; // flaky: level8.getClass();
        nl.tudelft.jpacman.board.Board board19 = null; // flaky: level8.getBoard();
        org.junit.Assert.assertNotNull(ghostArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(squareArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(board19);
    }
}
