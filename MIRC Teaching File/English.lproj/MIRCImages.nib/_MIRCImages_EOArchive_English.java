// _MIRCImages_EOArchive_English.java
// Generated by EnterpriseObjects palette at Tuesday, August 30, 2005 8:25:41 PM America/Denver

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.*;
import com.webobjects.eointerface.swing.EOTable._EOTableColumn;
import com.webobjects.foundation.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.text.*;

public class _MIRCImages_EOArchive_English extends com.webobjects.eoapplication.EOArchive {
    ArrayController _arrayController0;
    IBHelpConnector _iBHelpConnector0, _iBHelpConnector1, _iBHelpConnector2, _iBHelpConnector3;
    ImageCell _imageCell0;
    ObjectController _objectController0;
    com.webobjects.eointerface.swing.EOFrame _eoFrame0;
    com.webobjects.eointerface.swing.EOTable _nsTableView0;
    com.webobjects.eointerface.swing.EOTable._EOTableColumn _eoTableColumn0, _eoTableColumn1;
    com.webobjects.eointerface.swing.EOTextField _nsTextField0, _nsTextField1, _nsTextField2, _nsTextField3, _nsTextField4, _nsTextField5, _nsTextField6, _nsTextField7;
    com.webobjects.eointerface.swing.EOView _nsBox0, _nsBox1;
    javax.swing.JButton _nsButton0;
    javax.swing.JPanel _nsView0;

    public _MIRCImages_EOArchive_English(Object owner, NSDisposableRegistry registry) {
        super(owner, registry);
    }

    protected void _construct() {
        Object owner = _owner();
        EOArchive._ObjectInstantiationDelegate delegate = (owner instanceof EOArchive._ObjectInstantiationDelegate) ? (EOArchive._ObjectInstantiationDelegate)owner : null;
        Object replacement;

        super._construct();

        _imageCell0 = (ImageCell)_registered(new ImageCell(), "");
        _eoTableColumn1 = (com.webobjects.eointerface.swing.EOTable._EOTableColumn)_registered(new com.webobjects.eointerface.swing.EOTable._EOTableColumn(), "NSTableColumn1");
        _eoTableColumn0 = (com.webobjects.eointerface.swing.EOTable._EOTableColumn)_registered(new com.webobjects.eointerface.swing.EOTable._EOTableColumn(), "NSTableColumn");
        _nsTableView0 = (com.webobjects.eointerface.swing.EOTable)_registered(new com.webobjects.eointerface.swing.EOTable(), "NSTableView");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "nodeController")) != null)) {
            _objectController0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (ObjectController)replacement;
            _replacedObjects.setObjectForKey(replacement, "_objectController0");
        } else {
            _objectController0 = (ObjectController)_registered(new ObjectController(), "nodeController");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "imageArrayController")) != null)) {
            _arrayController0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (ArrayController)replacement;
            _replacedObjects.setObjectForKey(replacement, "_arrayController0");
        } else {
            _arrayController0 = (ArrayController)_registered(new ArrayController(), "ImageController");
        }

        _nsButton0 = (javax.swing.JButton)_registered(new javax.swing.JButton("OK"), "NSButton");
        _nsTextField7 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField2111");
        _nsTextField6 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField211");
        _nsTextField5 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField21");
        _nsTextField4 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField2");
        _iBHelpConnector3 = (IBHelpConnector)_registered(new IBHelpConnector(), "");
        _nsTextField3 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField111");
        _iBHelpConnector2 = (IBHelpConnector)_registered(new IBHelpConnector(), "");
        _nsTextField2 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField11");
        _iBHelpConnector1 = (IBHelpConnector)_registered(new IBHelpConnector(), "");
        _nsTextField1 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField1");
        _iBHelpConnector0 = (IBHelpConnector)_registered(new IBHelpConnector(), "");
        _nsTextField0 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField");
        _nsBox1 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "");
        _nsBox0 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "window")) != null)) {
            _eoFrame0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOFrame)replacement;
            _replacedObjects.setObjectForKey(replacement, "_eoFrame0");
        } else {
            _eoFrame0 = (com.webobjects.eointerface.swing.EOFrame)_registered(new com.webobjects.eointerface.swing.EOFrame(), "Window");
        }

        _nsView0 = (JPanel)_eoFrame0.getContentPane();
    }

    protected void _awaken() {
        super._awaken();
        _connect(_nsTableView0, _owner(), "dataSource");

        if (_replacedObjects.objectForKey("_objectController0") == null) {
            _connect(_owner(), _objectController0, "nodeController");
        }

        if (_replacedObjects.objectForKey("_arrayController0") == null) {
            _connect(_owner(), _arrayController0, "imageArrayController");
        }

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _connect(_owner(), _eoFrame0, "window");
        }

        _nsButton0.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "closeWindow", _nsButton0), ""));
    }

    protected void _init() {
        super._init();
        _eoTableColumn1.setMinWidth(38);
        _eoTableColumn1.setMaxWidth(1000);
        _eoTableColumn1.setPreferredWidth(124);
        _eoTableColumn1.setWidth(124);
        _eoTableColumn1.setResizable(true);
        _eoTableColumn1.setHeaderValue("Name");
        if ((_eoTableColumn1.getHeaderRenderer() != null)) {
        	((DefaultTableCellRenderer)(_eoTableColumn1.getHeaderRenderer())).setHorizontalAlignment(javax.swing.JTextField.LEFT);
        }
        _eoTableColumn0.setMinWidth(40);
        _eoTableColumn0.setMaxWidth(1000);
        _eoTableColumn0.setPreferredWidth(102);
        _eoTableColumn0.setWidth(102);
        _eoTableColumn0.setResizable(true);
        _eoTableColumn0.setHeaderValue("Image");
        if ((_eoTableColumn0.getHeaderRenderer() != null)) {
        	((DefaultTableCellRenderer)(_eoTableColumn0.getHeaderRenderer())).setHorizontalAlignment(javax.swing.JTextField.LEFT);
        }
        _nsTableView0.table().addColumn(_eoTableColumn0);
        _nsTableView0.table().addColumn(_eoTableColumn1);
        _setFontForComponent(_nsTableView0.table().getTableHeader(), "Lucida Grande", 11, Font.PLAIN);
        _nsTableView0.table().setRowHeight(67);
        _setFontForComponent(_nsButton0, "Lucida Grande", 13, Font.PLAIN);
        _nsButton0.setMargin(new Insets(0, 2, 0, 2));
        _setFontForComponent(_nsTextField7, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField7.setEditable(false);
        _nsTextField7.setOpaque(false);
        _nsTextField7.setText("Annotated:\n");
        _nsTextField7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        _nsTextField7.setSelectable(false);
        _nsTextField7.setEnabled(true);
        _nsTextField7.setBorder(null);
        _setFontForComponent(_nsTextField6, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField6.setEditable(false);
        _nsTextField6.setOpaque(false);
        _nsTextField6.setText("Original Format:\n");
        _nsTextField6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        _nsTextField6.setSelectable(false);
        _nsTextField6.setEnabled(true);
        _nsTextField6.setBorder(null);
        _setFontForComponent(_nsTextField5, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField5.setEditable(false);
        _nsTextField5.setOpaque(false);
        _nsTextField5.setText("Original size:\n");
        _nsTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        _nsTextField5.setSelectable(false);
        _nsTextField5.setEnabled(true);
        _nsTextField5.setBorder(null);
        _setFontForComponent(_nsTextField4, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField4.setEditable(false);
        _nsTextField4.setOpaque(false);
        _nsTextField4.setText("Initial:\n:\n");
        _nsTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        _nsTextField4.setSelectable(false);
        _nsTextField4.setEnabled(true);
        _nsTextField4.setBorder(null);
        _setFontForComponent(_nsTextField3, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField3.setEditable(true);
        _nsTextField3.setOpaque(true);
        _nsTextField3.setText("");
        _nsTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField3.setSelectable(true);
        _nsTextField3.setEnabled(true);
        _setFontForComponent(_nsTextField2, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField2.setEditable(true);
        _nsTextField2.setOpaque(true);
        _nsTextField2.setText("");
        _nsTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField2.setSelectable(true);
        _nsTextField2.setEnabled(true);
        _setFontForComponent(_nsTextField1, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField1.setEditable(true);
        _nsTextField1.setOpaque(true);
        _nsTextField1.setText("");
        _nsTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField1.setSelectable(true);
        _nsTextField1.setEnabled(true);
        _setFontForComponent(_nsTextField0, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField0.setEditable(true);
        _nsTextField0.setOpaque(true);
        _nsTextField0.setText("");
        _nsTextField0.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField0.setSelectable(true);
        _nsTextField0.setEnabled(true);
        if (!(_nsBox1.getLayout() instanceof EOViewLayout)) { _nsBox1.setLayout(new EOViewLayout()); }
        _nsTextField0.setSize(221, 22);
        _nsTextField0.setLocation(131, 94);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsTextField0, EOViewLayout.MinYMargin);
        _nsBox1.add(_nsTextField0);
        _nsTextField1.setSize(221, 22);
        _nsTextField1.setLocation(131, 126);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsTextField1, EOViewLayout.MinYMargin);
        _nsBox1.add(_nsTextField1);
        _nsTextField2.setSize(221, 22);
        _nsTextField2.setLocation(131, 154);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsTextField2, EOViewLayout.MinYMargin);
        _nsBox1.add(_nsTextField2);
        _nsTextField3.setSize(221, 22);
        _nsTextField3.setLocation(131, 186);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsTextField3, EOViewLayout.MinYMargin);
        _nsBox1.add(_nsTextField3);
        _nsTextField4.setSize(114, 17);
        _nsTextField4.setLocation(10, 97);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsTextField4, EOViewLayout.MinYMargin);
        _nsBox1.add(_nsTextField4);
        _nsTextField5.setSize(114, 17);
        _nsTextField5.setLocation(10, 129);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsTextField5, EOViewLayout.MinYMargin);
        _nsBox1.add(_nsTextField5);
        _nsTextField6.setSize(114, 17);
        _nsTextField6.setLocation(10, 159);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsTextField6, EOViewLayout.MinYMargin);
        _nsBox1.add(_nsTextField6);
        _nsTextField7.setSize(114, 17);
        _nsTextField7.setLocation(10, 189);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsTextField7, EOViewLayout.MinYMargin);
        _nsBox1.add(_nsTextField7);
        if (!(_nsBox0.getLayout() instanceof EOViewLayout)) { _nsBox0.setLayout(new EOViewLayout()); }
        _nsBox1.setSize(371, 340);
        _nsBox1.setLocation(2, 15);
        ((EOViewLayout)_nsBox0.getLayout()).setAutosizingMask(_nsBox1, EOViewLayout.MinYMargin);
        _nsBox0.add(_nsBox1);
        _nsBox0.setBorder(new com.webobjects.eointerface.swing._EODefaultBorder("Images", true, "Lucida Grande", 11, Font.PLAIN));
        if (!(_nsView0.getLayout() instanceof EOViewLayout)) { _nsView0.setLayout(new EOViewLayout()); }
        _nsBox0.setSize(375, 357);
        _nsBox0.setLocation(280, 14);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsBox0, EOViewLayout.WidthSizable | EOViewLayout.HeightSizable);
        _nsView0.add(_nsBox0);
        _nsButton0.setSize(75, 26);
        _nsButton0.setLocation(581, 393);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton0, EOViewLayout.MinXMargin | EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton0);
        _nsTableView0.setSize(234, 401);
        _nsTableView0.setLocation(18, 14);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTableView0, EOViewLayout.MaxXMargin | EOViewLayout.HeightSizable);
        _nsView0.add(_nsTableView0);

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _nsView0.setSize(665, 429);
            _eoFrame0.setTitle("Window");
            _eoFrame0.setLocation(611, 515);
            _eoFrame0.setSize(665, 429);
        }
    }
}