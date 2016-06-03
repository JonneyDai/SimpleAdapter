#SimpleAdapter

A SimpleAdapter for RecyclerView

-----------------

> This is an Adapter for RecyclerView, contains some usual methods,such as setText(), setImageResource() etc.


##Get it
* Gradle
```
compile 'com.sakurawood:simpleadapter:1.0.3'
```
* Maven
```
<dependency>
  <groupId>com.sakurawood</groupId>
  <artifactId>simpleadapter</artifactId>
  <version>1.0.3</version>
  <type>pom</type>
</dependency>
```
* Ivy
```
<dependency org='com.sakurawood' name='simpleadapter' rev='1.0.3'>
  <artifact name='$AID' ext='pom'></artifact>
</dependency>
```

##Setup
* Initialize like this:
```java
  simpleAdapter=new SimpleAdapter<Bean>(getContext(),R.layout.item,yourlistbean) {
            @Override
            protected void convert(SimpleViewHolder holder, Bean item) {
                holder.setText(R.id.name,item.getName());
                holder.setText(R.id.value,item.getValue());
                holder.setImageResource(R.id.img,item.getPic());
            }

        };

```

* Add a clicklistener for RecyclerView:
```java
 simpleAdapter.setOnRecyclerViewItemClickListener(new SimpleAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onClick(View view, int position) {
	            ...
            }

            @Override
            public boolean onLongClick(View view, int position) {
	            ...
                return false;
            }
        });
```
