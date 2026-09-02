(ns simple-billy-api.specs.ghg-scope
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ghg-scope-data
  {
   })

(def ghg-scope-spec
  (ds/spec
    {:name ::ghg-scope
     :spec ghg-scope-data}))
