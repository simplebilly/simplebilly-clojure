(ns simple-billy-api.specs.pos-register-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pos-register-status-data
  {
   })

(def pos-register-status-spec
  (ds/spec
    {:name ::pos-register-status
     :spec pos-register-status-data}))
