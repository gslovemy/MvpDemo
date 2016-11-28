# MVP Sample
> MVP架构模式入门案例，列子比较多,我觉得我这个简单,易懂,欢迎大家star.
### MVP架构模式细解 ###
- 概念解释
	<ul>
<li>MVP是Model(数据,网络) View(界面) Presenter(表现层)的缩写，它是MVC架构的变种，强调Model和View的最大化解耦和单一职责原则</li>
<li>Model：负责数据的来源和封装，比如网络请求类，数据库操作类以及java bean，如果有必要则提供接口暴露自己处理数据的状态和进度,自己写一个回调就行.</li>
<li>View：负责UI相关，如布局UI的初始化，各种listener的设置。在Android中，我们通常写的Activity和Fragment就是属于View层；在web开发中，html则是View层。</li>
<li>Presenter：专门从C独立出来的业务逻辑层，主要负责处理原先View层的业务逻辑，解决了Activity的臃肿问题，让Activity只负责处理UI，职责更加明确；并且将View层的业务逻辑抽取到P层之后，View层与Model层也实现了解耦；便于后期代码的扩展和维护,并且业务逻辑层独立后代码还得到很大的重用性</li>
<li>总结：MVC模式下，V和C纠缠不清，并且View和Model相互关联，而MVP模式下Model和VIew解耦，便于单元测试，项目维护，代码重用</li>

<li>效果展示

![](http://i.imgur.com/swn9tAL.gif) </li></ul>

- 包结构如下：
	- model : LoginModel
	- presenter：LoginPresenter
	- view：Activity，Fragment,etc.
	- base:BaseAcitivity,BasePresenter,etc.
	- mvp IView, IModel,IPresenter.
	- contract 契约类,接口定义.
	- unitls 工具栏.
	
- How To Use:
	- read the code!

	