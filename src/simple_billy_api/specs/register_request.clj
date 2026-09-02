(ns simple-billy-api.specs.register-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def register-request-data
  {
   (ds/req :company_name) string?
   (ds/req :email) string?
   (ds/req :first_name) string?
   (ds/req :last_name) string?
   (ds/req :password) string?
   (ds/req :privacy_accepted) boolean?
   })

(def register-request-spec
  (ds/spec
    {:name ::register-request
     :spec register-request-data}))
