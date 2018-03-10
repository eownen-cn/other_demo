var store = {
	set:function(name,list){
		localStorage.setItem(name,JSON.stringify(list))
	},
	fetch:function(name){
		return JSON.parse(localStorage.getItem(name)) || []
	}
}

var filter = {
	all:function(list){
		return list;
	},
	todo:function(list){
		return list.filter(function(val){
			return !val.isChecked;
		})
	},
	completed:function(list){
		return list.filter(function(val){
			return val.isChecked;
		})
	}
}

var vm = new Vue({
	el:'.main',
	data:{
		list:store.fetch('web05'),
		todo:'',
		editor:'',
		beforeEdit:'',
		value:'all'
	},
	methods:{
		addTodo(){
			this.list.push({
				title:this.todo,
				isChecked:false
			})
			this.todo=''
		},
		deleteTodo(item){
			this.list.splice(this.list.indexOf(item),1);
		},
		editorTodo(item){
			this.beforeEdit = item.title;
			this.editor = item;
		},
		confirmTodo(){
			this.editor = '';
		},
		cancleTodo(item){
			item.title = this.beforeEdit;
			this.editor = '';
			this.beforeEdit = '';
		}
	},
	directives:{
		focus:function(el,binding){
			if (binding.value) {
				el.focus()
			}
		}
	},
	computed:{
		notComplete:function(){
			return this.list.filter(function(obj){
				return !obj.isChecked
			}).length
		},
		filtedList:function(){
			return filter[this.value]?filter[this.value](this.list):filter['all'](this.list)
		}
	},
	watch:{
		list:{
			handler:function(val,oldval){
				store.set('web05',this.list)
			},
			deep:true
		}
	}
})


function getHashChange(){
	var hash = location.hash.slice(1);
	vm.value = hash;
}
getHashChange()
window.addEventListener('hashchange',getHashChange)

