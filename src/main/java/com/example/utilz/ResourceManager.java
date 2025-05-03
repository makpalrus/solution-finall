package com.example.utilz;

import java.awt.image.BufferedImage;
import static utilz.LoadSave.*;

public class ResourceManager {

    // 🔹 Игрок, враги, объекты
    public static BufferedImage getPlayerAtlas() {
        return GetSpriteAtlas(PLAYER_ATLAS);
    }

    public static BufferedImage getCrabbySprite() {
        return GetSpriteAtlas(CRABBY_SPRITE);
    }

    public static BufferedImage getPinkstarAtlas() {
        return GetSpriteAtlas(PINKSTAR_ATLAS);
    }

    public static BufferedImage getSharkAtlas() {
        return GetSpriteAtlas(SHARK_ATLAS);
    }

    public static BufferedImage getStatusBar() {
        return GetSpriteAtlas(STATUS_BAR);
    }

    // 🔹 Уровни и объекты
    public static BufferedImage getLevelSprite() {
        return GetSpriteAtlas(LEVEL_ATLAS);
    }

    public static BufferedImage getPotionAtlas() {
        return GetSpriteAtlas(POTION_ATLAS);
    }

    public static BufferedImage getContainerAtlas() {
        return GetSpriteAtlas(CONTAINER_ATLAS);
    }

    public static BufferedImage getTrapAtlas() {
        return GetSpriteAtlas(TRAP_ATLAS);
    }

    public static BufferedImage getCannonAtlas() {
        return GetSpriteAtlas(CANNON_ATLAS);
    }

    public static BufferedImage getCannonBallAtlas() {
        return GetSpriteAtlas(CANNON_BALL);
    }

    public static BufferedImage getGrassAtlas() {
        return GetSpriteAtlas(GRASS_ATLAS);
    }

    public static BufferedImage getTreeOneAtlas() {
        return GetSpriteAtlas(TREE_ONE_ATLAS);
    }

    public static BufferedImage getTreeTwoAtlas() {
        return GetSpriteAtlas(TREE_TWO_ATLAS);
    }

    // 🔹 Меню, UI
    public static BufferedImage getMenuButtons() {
        return GetSpriteAtlas(MENU_BUTTONS);
    }

    public static BufferedImage getMenuBackground() {
        return GetSpriteAtlas(MENU_BACKGROUND);
    }

    public static BufferedImage getPauseBackground() {
        return GetSpriteAtlas(PAUSE_BACKGROUND);
    }

    public static BufferedImage getOptionsMenu() {
        return GetSpriteAtlas(OPTIONS_MENU);
    }

    public static BufferedImage getSoundButtons() {
        return GetSpriteAtlas(SOUND_BUTTONS);
    }

    public static BufferedImage getUrmButtons() {
        return GetSpriteAtlas(URM_BUTTONS);
    }

    public static BufferedImage getVolumeButtons() {
        return GetSpriteAtlas(VOLUME_BUTTONS);
    }

    // 🔹 Эффекты, UI
    public static BufferedImage getQuestionAtlas() {
        return GetSpriteAtlas(QUESTION_ATLAS);
    }

    public static BufferedImage getExclamationAtlas() {
        return GetSpriteAtlas(EXCLAMATION_ATLAS);
    }

    public static BufferedImage getRainParticle() {
        return GetSpriteAtlas(RAIN_PARTICLE);
    }

    public static BufferedImage getDeathScreen() {
        return GetSpriteAtlas(DEATH_SCREEN);
    }

    public static BufferedImage getCompletedImage() {
        return GetSpriteAtlas(COMPLETED_IMG);
    }

    public static BufferedImage getCreditsImage() {
        return GetSpriteAtlas(CREDITS);
    }

    public static BufferedImage getGameCompletedImage() {
        return GetSpriteAtlas(GAME_COMPLETED);
    }

    // 🔹 Фоновые изображения
    public static BufferedImage getMenuBackgroundImage() {
        return GetSpriteAtlas(MENU_BACKGROUND_IMG);
    }

    public static BufferedImage getPlayingBackgroundImage() {
        return GetSpriteAtlas(PLAYING_BG_IMG);
    }

    public static BufferedImage getBigClouds() {
        return GetSpriteAtlas(BIG_CLOUDS);
    }

    public static BufferedImage getSmallClouds() {
        return GetSpriteAtlas(SMALL_CLOUDS);
    }

    public static BufferedImage getWaterTop() {
        return GetSpriteAtlas(WATER_TOP);
    }

    public static BufferedImage getWaterBottom() {
        return GetSpriteAtlas(WATER_BOTTOM);
    }

    public static BufferedImage getShip() {
        return GetSpriteAtlas(SHIP);
    }
}
