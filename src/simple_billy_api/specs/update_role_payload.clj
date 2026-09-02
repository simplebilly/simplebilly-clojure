(ns simple-billy-api.specs.update-role-payload
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def update-role-payload-data
  {
   (ds/req :role) string?
   (ds/opt :sync_permissions) boolean?
   })

(def update-role-payload-spec
  (ds/spec
    {:name ::update-role-payload
     :spec update-role-payload-data}))
