function addInfo() {

    var html ="<tr>\n" +
        "\t\t<td><input type='text' name='appid'+ /></td>\n" +
        "\t\t<td><input type='text' /></td>\n" +
        "\t\t<td><input type='text' /></td>\n" +
        "\t</tr>"
    $("#appTable").append(html);


}

function saveInfo() {
    var objArr=[];
    var t01=$("#appTable tr").length;
    //console.log("t01:"+t01);
    $('#appTable').find('tr').each(function(i){
        //去除表头
        if(i>0){
            var obj=$(this).attr("data");
            //console.log("obj:"+obj);
            var obj1=JSON.parse(obj);
            //console.log("obj1:"+obj1);
            objArr.push(obj1);

        }
    });
    debugger

    var objArray = new Array();
    //获取tbody下的所有tr原素
    var tr = $("#appTable").find("tr");
    //循环tr原素
    $.each(tr, function (i, f) {
        //找到所有input
        var inputs = $(f).find('input');
        //新建对象
        var obj = {};
        //循环所有inputs，把input中的name和value变成对象中的属性和值
        for (var j = 0; j < inputs.length; j++) {
            debugger
            var o = inputs[j];
            obj[$(o).attr('name')] = $(o).val();
        }
        //将对象放入对象数组
        objArray.push(obj);
    });


    $.ajax({
        url: baseURL + "sys/variable/saveVari",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(objArray),
        success: function (r) {
            if (r.code == 0) {
                alert("保存成功");
            } else {
                alert("保存失败");
            }
        }
    });
}