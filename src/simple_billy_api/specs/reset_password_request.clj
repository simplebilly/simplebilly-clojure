(ns simple-billy-api.specs.reset-password-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def reset-password-request-data
  {
   (ds/req :new_password) string?
   (ds/req :token) string?
   })

(def reset-password-request-spec
  (ds/spec
    {:name ::reset-password-request
     :spec reset-password-request-data}))
