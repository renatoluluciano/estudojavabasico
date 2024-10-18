function Formulario(){
    return(
        <form>
            <input type="text" placeholder="Nome"/>
            <input type="date" placeholder="DataInicial"/>
            <input type="date" placeholder="Data Final"/>
            <select placeholder="Tipo de Afastamento">
            <option selected>TIPO DE AFASTAMENTO</option>
  	            <option value="FERIAS">FERIAS</option>
  	            <option value="FOLGABH">FOLGA COMPENSATORIA</option>
  	            <option value="ABONO">ABONO</option>
  	            <option value="LICENCA_PREMIO">LICENSA PREMIO</option>
            </select>

        </form>
    )
}

export default Formulario;