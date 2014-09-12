package com.zwh.fileview;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {
	private Context mContext;
	private File[] fileList;

	private boolean mIsSearch = false;

	private boolean actionModeStarted;
	private boolean[] multiChoiceItemChecked;

	public ListViewAdapter(Context context, File[] dataList) {  
		this.mContext = context;  
		setFileData(dataList);
	}  

	public void setFileData(File[] dataList){
		if( null != dataList ){
			Arrays.sort(dataList, FileOpertion.fileComparator);
		}

		this.fileList = dataList;
	}

	@Override  
	public int getCount() {
		if( null == fileList ){
			return 0;
		}
		return fileList.length; 
	}  

	@Override  
	public File getItem(int position) {  
		return fileList[position];
	}  

	@Override  
	public long getItemId(int position) {  
		return position;
	}  

	@Override  
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;  
		if (convertView == null) {  
			holder = new ViewHolder();  
			convertView = LayoutInflater.from(mContext).inflate(  
					R.layout.main_listview_item, null);
			holder.fileNameTextView = (TextView) convertView.findViewById(R.id.file_name_textview);  
			holder.filePathTextView = (TextView) convertView.findViewById(R.id.file_path_textview);  
			holder.fileIconImageView = (ImageView) convertView.findViewById(R.id.file_icon_iamgeview);  

			convertView.setTag(holder);
		} else {  
			holder = (ViewHolder) convertView.getTag();
		}  

		holder.fileNameTextView.setText(fileList[position].getName());

		if (mIsSearch) {
			holder.filePathTextView.setText(fileList[position].getParent());
		}
		else{
			holder.filePathTextView.setText(null);
		}

		Drawable drawableLeft = FileOpertion.getDrawable(mContext, fileList[position]);
		holder.fileIconImageView.setImageDrawable(drawableLeft);

		updateBackground( position, convertView );
		return convertView;
	}  

	/** 
	 * ViewHolder�����Դ���item�пؼ������� 
	 */  
	final class ViewHolder {  
		TextView fileNameTextView;
		TextView filePathTextView;
		ImageView fileIconImageView;
	}

	public void updateBackground(int position, View view) {
		int backgroundId;
		if ( actionModeStarted && multiChoiceItemChecked[position]) {
			backgroundId = android.R.color.holo_blue_light;
		} else {
			backgroundId = 0;
		}
		view.setBackgroundResource(backgroundId);
	}

	public void uncheckAll(){
		for(int i=0;i<multiChoiceItemChecked.length;i++){
			multiChoiceItemChecked[i] = false;
		}
	}

	public boolean isAllChecked(){
		for(boolean checked : multiChoiceItemChecked ){
			if( !checked ) return false;
		}
		return true;
	}

	public void checkAll(){
		for(int i = 0; i < multiChoiceItemChecked.length; i++){
			multiChoiceItemChecked[i] = true;
		}
	}

	public int getCheckedItemCount(){
		int count = 0;
		for( boolean checked : multiChoiceItemChecked ){
			if( checked ) count++;
		}
		return count;
	}
	
	public List<File> getCheckedFile(){
		List<File> checkedFileList = new ArrayList<File>();
		
		for (int i = 0; i < multiChoiceItemChecked.length; i++) {
			if( multiChoiceItemChecked[i] ){
				checkedFileList.add(fileList[i]);
			}
		}

		return checkedFileList;
	}

	public void setActionModeState(boolean flag){
		actionModeStarted = flag;

		if( actionModeStarted ){
			multiChoiceItemChecked = new boolean[fileList.length];

			for(int i=0;i<fileList.length;i++){
				multiChoiceItemChecked[i] = false;
			}
		}
	}

	public void setSearchState(boolean flag){
		mIsSearch = flag;
	}

	public void setItemChecked(int position, boolean flag){
		multiChoiceItemChecked[position] = flag;
	}

	public boolean isActionModeStart(){
		return actionModeStarted;
	}

	public boolean[] getItemState(){
		return multiChoiceItemChecked;
	}
}  