package lab.buaa.software.lidl.tests;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class LidlTestUtil {
  public static CharSequence dataLibRaw() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package lidl.lang;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("data Text");
    _builder.newLine();
    _builder.append("is Undefined");
    _builder.newLine();
    _builder.newLine();
    _builder.append("data Activation");
    _builder.newLine();
    _builder.append("is Undefined");
    _builder.newLine();
    _builder.newLine();
    _builder.append("data Boolean");
    _builder.newLine();
    _builder.append("is Undefined");
    _builder.newLine();
    _builder.newLine();
    _builder.append("data Number");
    _builder.newLine();
    _builder.append("is Undefined");
    _builder.newLine();
    return _builder;
  }
}
