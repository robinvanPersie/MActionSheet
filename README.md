# MActionSheet
模仿iOS的actionSheet写的一个简易的actionSheet，返回键会优先关闭。

## 用法
```
private MActionSheet actionSheet;

private void showActionSheet() {
	if (actionSheet == null) {
	   actionSheet = new MIActionSheet.Builder(this)
        .setItemArray(new int[] {R.string.xxx, R.string.yyy}) // 请先设置itemArray
        .setOnMenuItemClick(listener)
        .setCancelButtonTitle(R.string.title)  // title默认文字“取消” 可以不设置
        .setCancelTextColor(R.color.black)
        .build();
	}
	actionSheet.setItemArray(new int[] {R.string.aaa, R.string.bbb}); // 如果需要修改item项，可以再次setItemArray。
	actionSheet.show();
}

private void dismissActionSheet() {
	actionSheet.dismiss();
}

OnMenuItemClickListener listener = new MenuItemClickListener() {
    		@Override
    		public void onItemClick(int resId) {
    			switch(resId) {
    				case R.string.xxx:
    					break;
    				case R.string.yyy:
    					break;
    				default:
    					break;
    			}
    		}
		};

```

### 设置黑透部分是否允许点击关闭
```
/**
 * 黑透部分是否允许点击关闭
 * @param cancel   true:允许，false:不允许
 */
actionSheet.setCanceledOnTouchOutside(boolean cancel)

```

MActionSheet支持修改每一项的字号，字色，文字内容，背景。（需要通过传入resourceId的形式修改），所有方法的position都是从0开始，从上往下数，不包括最下方的取消button。


### 修改字色

```
/**
 * 指定item更换字体颜色
 * @param colorId    颜色
 * @param position   位置
 */
actionSheet.setTextColor(int colorId, int position)
```

### 修改字体

```
/**
 * 指定item更换字体大小
 * @param dimen      字体大小
 * @param position   位置
 */
actionSheet.setTextSize(int dimenId, int position)
```
### 修改文字内容

```
/**
 * 指定item更换文本
 * @param text
 * @param position
 */
actionSheet.setText(String text, int position)

/**
 * 指定item更换文本
 * @param resId
 * @param position
 */
actionSheet.setText(int resId, int position)
```
### 修改背景
```
/**
 * 指定item更换背景
 * @param drawableId
 * @param position
 */
actionSheet.setTextBackground(int drawableId, int position)
```
### 设置item是否可用
```
/**
 * 设置view是否可用
 * @param enable
 * @param position
 */
actionSheet.setViewEnable(boolean enable, int position)
```


