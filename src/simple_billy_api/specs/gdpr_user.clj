(ns simple-billy-api.specs.gdpr-user
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gdpr-user-data
  {
   (ds/req :createdAt) inst?
   (ds/req :email) string?
   (ds/req :id) uuid?
   (ds/req :name) string?
   })

(def gdpr-user-spec
  (ds/spec
    {:name ::gdpr-user
     :spec gdpr-user-data}))
