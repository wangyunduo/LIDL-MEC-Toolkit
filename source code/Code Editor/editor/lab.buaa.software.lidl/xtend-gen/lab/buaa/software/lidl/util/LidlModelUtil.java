package lab.buaa.software.lidl.util;

import lab.buaa.software.lidl.lidl.CompositeDataType;
import lab.buaa.software.lidl.lidl.LidlData;
import lab.buaa.software.lidl.lidl.LidlDataType;
import lab.buaa.software.lidl.lidl.RefDataType;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class LidlModelUtil {
  public static CharSequence datatypeAsString(final LidlData d) {
    CharSequence _switchResult = null;
    LidlDataType _definition = d.getDefinition();
    boolean _matched = false;
    if (_definition instanceof CompositeDataType) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CompositeDataType");
      _switchResult = _builder;
    }
    if (!_matched) {
      if (_definition instanceof RefDataType) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("RefDataType");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
}
