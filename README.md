PullRefreshLayout
=========================
![MinAPI](https://img.shields.io/badge/API-15%2B-blue)
[![Release](https://jitpack.io/v/am3n/PullRefreshLayout.svg)](https://jitpack.io/#am3n/PullRefreshLayout)

#### Beautiful swipe refresh layout!

## Installation

To use this library in your project add this to your build.gradle:

```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
dependencies {
    implementation 'com.github.am3n:PullRefreshLayout:NEWEST-VERSION'
}
```


## Usage

Add it in your layout xml.

```xml 
<ir.am3n.pullrefreshlayout.PullRefreshLayout
    android:id="@+id/prl"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
	<!-- ListView、ScrollView、RecyclerView、Other -->
</ir.am3n.pullrefreshlayout.PullRefreshLayout>
```

Get instance and use it.

```java
PullRefreshLayout prl = (PullRefreshLayout) findViewById(R.id.prl);
// listen refresh event
prl.setOnRefreshListener(new PullRefreshLayout.OnRefreshListener() {
    @Override
    public void onRefresh() {
        // refreshing
    }
});
// cancel refresh
prl.cancelRefreshing();

```
---
#### Change the refresh style.
There are five styles of use, `MATERIAL`、`CIRCLES`、 `WATER_DROP`、`RING` and `SMARTISAN`.  

In java, call `setRefreshStyle` method.

```java
prl.setRefreshStyle(PullRefreshLayout.STYLE_CIRCLES);
```

In xml, use attributes.

```xml
<ir.am3n.pullrefreshlayout.PullRefreshLayout
    android:id="@+id/prl"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:refreshType="water_drop">
	
</ir.am3n.pullrefreshlayout.PullRefreshLayout>

```
---
#### Change the color scheme.
In java, call `setColorSchemeColors` method. The int array length must be 4.
```java
prl.setColorSchemeColors(int []);
```
For Smartisan style, it has only one color, can call 'setColor' method, to set one color.
```java
prl.setColor(int);
```

In xml, use attributes.

```xml
<ir.am3n.pullrefreshlayout.PullRefreshLayout
    android:id="@+id/prl"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:refreshColors="@array/scheme_colors"
    app:refreshColor="@color/one_color">
	
</ir.am3n.pullrefreshlayout.PullRefreshLayout>
```
---
#### Customize the refresh style.

```java
class CustomDrawable extends RefreshDrawable { ... }

prl.setRefreshDrawable(new CustomDrawable());
```
---
#### Enable auto cancel refreshing
```java
prl.autoCancellationEnabled = true;
prl.autoCancellationTimeout = 5 * 1000;
```

## Thanks

* [PullRefreshLayout](https://github.com/baoyongzhang/android-PullRefreshLayout)
* [SwipeRefreshLayout](https://developer.android.com/reference/android/support/v4/widget/SwipeRefreshLayout.html)
* [GoogleProgressBar](https://github.com/jpardogo/GoogleProgressBar) 

## License

    The MIT License (MIT)

	Copyright (c) 2014 baoyongzhang

	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included in all
	copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
	SOFTWARE.


