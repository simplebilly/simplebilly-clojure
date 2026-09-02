(ns simple-billy-api.specs.update-permissions-payload
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def update-permissions-payload-data
  {
   (ds/req :permissions) (s/coll-of string?)
   })

(def update-permissions-payload-spec
  (ds/spec
    {:name ::update-permissions-payload
     :spec update-permissions-payload-data}))
