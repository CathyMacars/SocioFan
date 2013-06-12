<?php include "inc/head.html"; ?>

  <body class="PKT_ENABLED login">
    <div class="container">
      <form class="form-signin">
        <h2 class="form-signin-heading">Login</h2>
        <input type="text" class="input-block-level" placeholder="Email">
        <input type="password" class="input-block-level" placeholder="Senha">
<!--         <label class="checkbox">
          <input type="checkbox" value="remember-me"> Lembrar
        </label> -->
        <button type="button" class="btn btn-large btn-primary" onclick="window.location.href='index.php'">Entrar</button>
      </form>
    </div> <!-- /container -->

<?php include "inc/footer.php"; ?>
