package com.github.nsorin.aramis.ui.controller;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;

class KeyboardShortcuts {
    public static final KeyCodeCombination NEW = new KeyCodeCombination(KeyCode.N, KeyCombination.CONTROL_ANY);
    public static final KeyCodeCombination OPEN = new KeyCodeCombination(KeyCode.O, KeyCombination.CONTROL_ANY);
    public static final KeyCodeCombination SAVE = new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_ANY);
    public static final KeyCodeCombination SAVE_AS = new KeyCodeCombination(KeyCode.S, KeyCombination.SHIFT_ANY, KeyCombination.CONTROL_ANY);
    public static final KeyCodeCombination RELOAD = new KeyCodeCombination(KeyCode.R, KeyCombination.CONTROL_ANY);

    public static final KeyCodeCombination FULL_SCREEN = new KeyCodeCombination(KeyCode.F11);
}
