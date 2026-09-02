(ns simple-billy-api.specs.login-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def login-request-data
  {
   (ds/req :email) string?
   (ds/req :password) string?
   (ds/opt :totp_code) string?
   })

(def login-request-spec
  (ds/spec
    {:name ::login-request
     :spec login-request-data}))
