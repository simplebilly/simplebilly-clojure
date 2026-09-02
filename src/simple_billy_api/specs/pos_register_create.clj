(ns simple-billy-api.specs.pos-register-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.pos-register-status :refer :all]
            )
  (:import (java.io File)))


(def pos-register-create-data
  {
   (ds/req :name) string?
   (ds/opt :status) pos-register-status-spec
   })

(def pos-register-create-spec
  (ds/spec
    {:name ::pos-register-create
     :spec pos-register-create-data}))
