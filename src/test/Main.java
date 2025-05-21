package test;

public class Main {
  public static void main(String[] args) {
//    Button button = new Button(2);
//    Mouse mouse = new Mouse(button);
//    Computer computer = new Computer(mouse);
    Button button = new Button();
    button.setX(2);
    Mouse mouse = new Mouse();
    mouse.setButton(button);
    Computer computer = new Computer();
    computer.setMouse(mouse);
    System.out.println(computer.getMouse());
    System.out.println(computer);
  }
}

class Button {
  private int x;

  public Button() {}
  public Button(int x) {
    this.x = x;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  @Override
  public String toString() {
    return "Button{" +
        "x=" + x +
        '}';
  }
}

class Mouse {
  private Button button;
  public Mouse() {}
  public Mouse(Button button) {
    this.button = button;
  }

  public Button getButton() {
    return button;
  }

  public void setButton(Button button) {
    this.button = button;
  }

  @Override
  public String toString() {
    return "Mouse{" +
        "button=" + button +
        '}';
  }
}

class Computer {
  private Mouse mouse;
  public Computer() {}
  public Computer(Mouse mouse) {
    this.mouse = mouse;
  }

  public Mouse getMouse() {
    return mouse;
  }

  public void setMouse(Mouse mouse) {
    this.mouse = mouse;
  }

  @Override
  public String toString() {
    return "Computer{" +
        "mouse=" + mouse +
        '}';
  }
}
