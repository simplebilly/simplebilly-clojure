(ns simple-billy-api.specs.change-password-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def change-password-request-data
  {
   (ds/req :current_password) string?
   (ds/req :new_password) string?
   })

(def change-password-request-spec
  (ds/spec
    {:name ::change-password-request
     :spec change-password-request-data}))
