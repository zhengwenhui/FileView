/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.zwh.fileview;

public final class R {
    public static final class attr {
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int metaButtonBarButtonStyle=0x7f010001;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int metaButtonBarStyle=0x7f010000;
    }
    public static final class color {
        public static final int black_overlay=0x7f040000;
    }
    public static final class dimen {
        public static final int action_bar_default_height=0x7f050003;
        public static final int listPreferredItemHeight=0x7f050000;
        public static final int listPreferredItemHeightLarge=0x7f050002;
        public static final int listPreferredItemHeightSmall=0x7f050001;
    }
    public static final class drawable {
        public static final int ab_solid_light_holo=0x7f020000;
        public static final int d_actionbar_icon_add_folder_disabled=0x7f020001;
        public static final int d_actionbar_icon_add_folder_enabled=0x7f020002;
        public static final int d_actionbar_icon_copy_disabled=0x7f020003;
        public static final int d_actionbar_icon_copy_enabled=0x7f020004;
        public static final int d_actionbar_icon_cut_disabled=0x7f020005;
        public static final int d_actionbar_icon_cut_enabled=0x7f020006;
        public static final int d_actionbar_icon_delete_disabled=0x7f020007;
        public static final int d_actionbar_icon_delete_enabled=0x7f020008;
        public static final int d_actionbar_icon_edit_disabled=0x7f020009;
        public static final int d_actionbar_icon_edit_enabled=0x7f02000a;
        public static final int d_actionbar_icon_paste_disabled=0x7f02000b;
        public static final int d_actionbar_icon_paste_enabled=0x7f02000c;
        public static final int d_actionbar_icon_pin_file_disabled=0x7f02000d;
        public static final int d_actionbar_icon_pin_file_enabled=0x7f02000e;
        public static final int d_actionbar_icon_properties_disabled=0x7f02000f;
        public static final int d_actionbar_icon_properties_enabled=0x7f020010;
        public static final int d_actionbar_icon_rename_disabled=0x7f020011;
        public static final int d_actionbar_icon_rename_enabled=0x7f020012;
        public static final int d_actionbar_icon_search_disabled=0x7f020013;
        public static final int d_actionbar_icon_search_enabled=0x7f020014;
        public static final int d_actionbar_icon_share_disabled=0x7f020015;
        public static final int d_actionbar_icon_share_enabled=0x7f020016;
        public static final int ic_drawer_light=0x7f020017;
        public static final int ic_launcher=0x7f020018;
    }
    public static final class id {
        public static final int add_folder=0x7f080007;
        public static final int copy=0x7f08000a;
        public static final int cut=0x7f08000c;
        public static final int delete=0x7f08000b;
        public static final int detail=0x7f080010;
        public static final int drawer_layout=0x7f080003;
        public static final int dummy_button=0x7f080002;
        public static final int file_name_textview=0x7f080006;
        public static final int fullscreen_content=0x7f080000;
        public static final int fullscreen_content_controls=0x7f080001;
        public static final int index_view=0x7f080005;
        public static final int main_view=0x7f080004;
        public static final int paste=0x7f080009;
        public static final int rename=0x7f08000d;
        public static final int search=0x7f080008;
        public static final int share=0x7f08000e;
        public static final int shortcut=0x7f08000f;
    }
    public static final class layout {
        public static final int activity_fullscreen=0x7f030000;
        public static final int activity_mainview=0x7f030001;
        public static final int main_listview_item=0x7f030002;
    }
    public static final class menu {
        public static final int action=0x7f070000;
        public static final int contextual_action=0x7f070001;
    }
    public static final class string {
        public static final int add_floder=0x7f06000e;
        public static final int app_name=0x7f060000;
        public static final int copy=0x7f060005;
        public static final int cut=0x7f060007;
        public static final int delete=0x7f060006;
        public static final int detail=0x7f06000c;
        public static final int directory_is_exist_already=0x7f060011;
        public static final int drawer_close=0x7f060001;
        public static final int drawer_open=0x7f060002;
        public static final int dummy_button=0x7f060003;
        public static final int dummy_content=0x7f060004;
        public static final int paste=0x7f060008;
        public static final int rename=0x7f060009;
        public static final int search=0x7f06000d;
        public static final int share=0x7f06000a;
        public static final int shortcut=0x7f06000b;
        public static final int str_mkdir=0x7f06000f;
        public static final int str_newdir_text=0x7f060012;
        public static final int wrong_file_name=0x7f060010;
    }
    public static final class styleable {
        /** 
         Declare custom theme attributes that allow changing which styles are
         used for button bars depending on the API level.
         ?android:attr/buttonBarStyle is new as of API 11 so this is
         necessary to support previous API levels.
    
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_metaButtonBarButtonStyle com.zwh.fileview:metaButtonBarButtonStyle}</code></td><td></td></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_metaButtonBarStyle com.zwh.fileview:metaButtonBarStyle}</code></td><td></td></tr>
           </table>
           @see #ButtonBarContainerTheme_metaButtonBarButtonStyle
           @see #ButtonBarContainerTheme_metaButtonBarStyle
         */
        public static final int[] ButtonBarContainerTheme = {
            0x7f010000, 0x7f010001
        };
        /**
          <p>This symbol is the offset where the {@link com.zwh.fileview.R.attr#metaButtonBarButtonStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.zwh.fileview:metaButtonBarButtonStyle
        */
        public static final int ButtonBarContainerTheme_metaButtonBarButtonStyle = 1;
        /**
          <p>This symbol is the offset where the {@link com.zwh.fileview.R.attr#metaButtonBarStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.zwh.fileview:metaButtonBarStyle
        */
        public static final int ButtonBarContainerTheme_metaButtonBarStyle = 0;
    };
}