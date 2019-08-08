//var ur="https://swapi.co/api/people/";
//var Data;
// const getData = async () => {
//     try {
//         const response = await axios(url);
//         var json_response = await response;

//         console.log('response.data:', json_response.results);
//         //Data=response.data.results.json();
//         return json_response;
//         // const response2 = await axios(response.data);

//         // console.log('response2.data:', response2.data);
//     } catch (error) {
//         console.log('error:', error);

//     }
// };

// const json_data = getData(url);
// console.log('Hi',json_data);
// for(var i=0;i<json_data.length;i++){
//     console.log('loop',json_data[i]);
// }


async function fetchdata(ur) {
    try {
        dat = await fetch((ur))
        response = await dat.json();
        return response.results;
    } catch (e) {
        console.log(e);
    }
}



fun = fetchdata('https://swapi.co/api/people');
fun.then(json_obj => {

    json_obj.forEach(element => {
        document.getElementById("one").innerHTML += `
            <tr class="head">
            <td>${element.name} </td>
            <td>${element.height} </td>
            <td>${element.mass} </td>
            <td>${element.hair_color} </td>
            <td>${element.skin_color} </td>
            </tr>
        `
    });

    $('#search').on('input', (event) => {
        document.getElementById("one").innerHTML = '';
        json_obj.forEach(element => {
            if (new RegExp(`^${event.target.value}`).exec(element.name)) {
                document.getElementById("one").innerHTML += `
                    <tr class="head">
                    <td>${element.name} </td>
                    <td>${element.height} </td>
                    <td>${element.mass} </td>
                    <td>${element.hair_color} </td>
                    <td>${element.skin_color} </td>
                    </tr>
                `;
            }
        });
    });

});