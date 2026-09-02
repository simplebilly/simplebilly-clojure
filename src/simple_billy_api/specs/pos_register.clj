(ns simple-billy-api.specs.pos-register
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.pos-register-status :refer :all]
            )
  (:import (java.io File)))


(def pos-register-data
  {
   (ds/req :name) string?
   (ds/opt :status) pos-register-status-spec
   })

(def pos-register-spec
  (ds/spec
    {:name ::pos-register
     :spec pos-register-data}))
