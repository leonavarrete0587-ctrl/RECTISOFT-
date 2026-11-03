const modules = {
 clientes:["Clientes","Consulta y administra la información de los clientes del taller.","Módulo de clientes","Desde este espacio podrás consultar y administrar la información de los clientes del taller.","♙"],
 ordenes:["Órdenes de trabajo","Controla los trabajos y el estado de cada servicio.","Módulo de órdenes de trabajo","Aquí podrás registrar órdenes, consultar su estado y hacer seguimiento a los trabajos solicitados por los clientes.","▤"],
 servicios:["Servicios","Administra los servicios ofrecidos por la rectificadora.","Módulo de servicios","En este módulo se visualizarán los servicios de rectificación, reparación y mantenimiento ofrecidos por el taller.","⚙"],
 inventario:["Inventario","Consulta los productos y controla las existencias.","Módulo de inventario","Desde aquí podrás consultar productos, registrar entradas y salidas y revisar las existencias del inventario.","▦"],
 mecanicos:["Mecánicos","Consulta la información del personal técnico.","Módulo de mecánicos","Este espacio permitirá administrar la información de los mecánicos y relacionarlos con las órdenes de trabajo.","♧"],
 reportes:["Reportes","Consulta los indicadores y reportes del taller.","Módulo de reportes","Aquí se podrán consultar reportes de clientes, órdenes de trabajo, servicios e inventario.","▥"],
 configuracion:["Configuración","Preferencias generales del sistema.","Configuración del sistema","Este módulo estará destinado a la configuración general y administración de las opciones de RECTISOFT.","⚙"]
};
function showPage(page){
 const home=page==="inicio";
 document.getElementById("home").classList.toggle("active",home);
 document.getElementById("module").classList.toggle("active",!home);
 document.querySelectorAll(".nav").forEach(b=>b.classList.toggle("active",b.dataset.page===page));
 if(!home){const d=modules[page]||modules.clientes;
  ["moduleTitle","moduleSubtitle","moduleHeading","moduleDescription","moduleIcon"].forEach((id,i)=>document.getElementById(id).textContent=d[i]);}
 document.getElementById("sidebar").classList.remove("open");
 window.scrollTo({top:0,behavior:"smooth"});
}
document.querySelectorAll("[data-page]").forEach(b=>b.addEventListener("click",e=>{e.preventDefault();showPage(b.dataset.page)}));
document.getElementById("menuToggle").addEventListener("click",()=>document.getElementById("sidebar").classList.toggle("open"));
document.getElementById("today").textContent=new Intl.DateTimeFormat("es-CO",{weekday:"short",day:"numeric",month:"short",year:"numeric"}).format(new Date());
