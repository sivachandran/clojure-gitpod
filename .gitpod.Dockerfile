FROM gitpod/workspace-full

USER gitpod

# Install Clojure
RUN curl -O https://download.clojure.org/install/linux-install-1.10.1.536.sh \
    && chmod +x linux-install-1.10.1.536.sh  \
    && sudo ./linux-install-1.10.1.536.sh 

# Install rlwrap
RUN sudo apt-get install -y rlwrap

# Install Lein

RUN curl https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein > lein \
    && sudo mv lein /usr/local/bin/lein \
    && sudo chmod a+x /usr/local/bin/lein

# Give access back to gitpod image builder
USER root