import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Hashtable;

public class Keyboard extends JFrame implements KeyListener {
    private JPanel keyPanel;
    private JLabel q, w, e, r, t, y, u, i, o, p, a, s, d, f, g, h, j, k, l, z, x, c, v, b, n, m;

    private Hashtable<Character, JLabel> characterKeys;

    public Keyboard() {
        setCharacterKeyValues();
        this.setContentPane(keyPanel);
        this.addKeyListener(this);

    }

    private void setCharacterKeyValues() {
        this.characterKeys = new Hashtable<>() {{
            put('q', q);
            put('w', w);
            put('e', e);
            put('r', r);
            put('t', t);
            put('y', y);
            put('u', u);
            put('i', i);
            put('o', o);
            put('p', p);
            put('a', a);
            put('s', s);
            put('d', d);
            put('f', f);
            put('g', g);
            put('h', h);
            put('j', j);
            put('k', k);
            put('l', l);
            put('z', z);
            put('x', x);
            put('c', c);
            put('v', v);
            put('b', b);
            put('n', n);
            put('m', m);
        }};

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        JLabel targetLabel;
        if (this.characterKeys.containsKey(e.getKeyChar())) {
            targetLabel = this.characterKeys.get(e.getKeyChar());
            targetLabel.setForeground(Color.cyan);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.characterKeys.get(e.getKeyChar()).setForeground(Color.black);
    }
}
