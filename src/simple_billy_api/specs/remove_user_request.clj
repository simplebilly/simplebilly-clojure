(ns simple-billy-api.specs.remove-user-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def remove-user-request-data
  {
   (ds/req :email) string?
   })

(def remove-user-request-spec
  (ds/spec
    {:name ::remove-user-request
     :spec remove-user-request-data}))
